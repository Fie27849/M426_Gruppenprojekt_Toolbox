
public class dreieck3d 
{
	/**
	 * Programm welches anhand der Koordinaten die Fläche eines Dreiecks im 3 Dimensionalen Raum berechnet
	 */
	
	Double a,b,c,gamma,flaeche;
	int xa,ya,xb,yb,xc,yc,za,zb,zc;
	
	public dreieck3d()
	{
		
	}
	/**
	 * Um die Fläche zu berechnen wird der Winkel Gamma benötigt
	 */
	public void gammabestimmen()
	{
		double tempoben =  Math.pow(c,2) -  Math.pow( a,2 ) -  Math.pow( b,2 );
		double tempunten = -2 * a * b;
		
		double cosgamma = tempoben/tempunten;
		gamma = Math.acos(cosgamma);
		//gamma = Math.toDegrees(gamma);
	}
	/**
	 * Heir werden die drei Seiten a,b,c berechnet.
	 */
	public void seitenberechnen()
	{
		c = Math.sqrt(Math.pow((xa-xb), 2) + Math.pow((ya-yb), 2) + Math.pow((za-zb), 2));
		a = Math.sqrt(Math.pow((xb-xc), 2) + Math.pow((yb-yc), 2) + Math.pow((zb-zc), 2));
		b = Math.sqrt(Math.pow((xc-xa), 2) + Math.pow((yc-ya), 2) + Math.pow((zc-za), 2));
	}
	/**
	 * Berechnet anhand der Seiten a und b und dem Sinus des Winkels Gamma die Fläche des Dreiecks ABC
	 * @return Fläche
	 */
	public double flaechebestimmen()
	{
		 flaeche = 0.5 * a * b * Math.sin(gamma);
		 return flaeche;
	}
	
	 
	/**
	 * Testfunktion mit hardcodierten Werten gibt Pass oder not Pass aus
	 */
	public void test()
	{
		xa = 2;
		xb = 5;
		xc = 2;
		ya = 4;
		yb = 4;
		yc = 9;
		za = 0;
		zb = 0;
		zc = 0;
		
		seitenberechnen();
		gammabestimmen();
		double x = flaechebestimmen();
		
		if(Math.round(x) == 8)
		{
			System.out.println("Fläche Dreieck 3D: Pass");
			
		}
		else
		{
			System.out.println("Fläche Dreieck 3D: Not Pass");
			
		}
	}
}
