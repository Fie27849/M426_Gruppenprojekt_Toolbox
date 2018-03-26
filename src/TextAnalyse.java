import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextAnalyse implements StdFilesLoc {
	
	private Path home;
	private Scanner scan;
	private char letter;
	private int letterfound;
	private String mytext;
	private String textfile;
	
	public TextAnalyse(String textfile){
		this.textfile = textfile;
		this.letterfound = 0;
		this.home = Paths.get(HOME);
		this.scan = new Scanner(System.in);
		
		user_input();
		letter_search();
		result();
	}
	public void start() {
		File mytextfile = new File(input.toString(), this.textfile);
		StringBuilder mystringbuilder = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(mytextfile));
			String line;
		    while ((line = br.readLine()) != null) {
		    	mystringbuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Pfad: " + home.toString());
        } 
		this.mytext = mystringbuilder.toString();
	}
	
	public void user_input() {
		System.out.println("Nach welchem Buchstaben suchen?");
		this.letter = scan.nextLine().charAt(0);
		start();
	}
	public void letter_search() {
		for (int i = 0; i < this.mytext.length(); i++) {
			if(this.mytext.charAt(i) == this.letter)
				letterfound++;
		}
	}
	
	public void result() {
		System.out.println("Dein Buchstabe " + this.letter + " wurde " + this.letterfound + " mal im Text gefunden");
	}
	@Override
	public void check_folder() {
		// TODO Auto-generated method stub
		
	}
}