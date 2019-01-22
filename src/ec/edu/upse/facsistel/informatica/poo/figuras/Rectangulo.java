package ec.edu.upse.facsistel.informatica.poo.figuras;
import ec.edu.upse.facsistel.informatica.poo.punto.Punto;

public class Rectangulo {
	
	private Punto esquinaSuperiorIzquierda;
	private double ancho, alto;
	
	public Rectangulo(Punto esquinaSuperiorIzquierda, double ancho, double alto)
	{
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public Rectangulo(Punto esquinaSuperiorIzquierda, Punto esquinaInferiorDerecha)
	{
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		ancho = Math.abs(esquinaInferiorDerecha.getX() - esquinaSuperiorIzquierda.getX());
		alto = Math.abs(esquinaInferiorDerecha.getY() - esquinaSuperiorIzquierda.getY());
	}
	
	//hacer un metodo que permita calcular el perimetro
	public double calcularPerimetro()
	{
		return 2*ancho + 2*alto;
	}
	
	public static double calcularPerimetro(double ancho, double alto)
	{
		return 2*ancho + 2*alto;
	}
	
	//hacer otro metodo, que permita calcular el area
	
	//toString
	public String toString()
	{
		return "Rectangulo con esquina superior izquierda " 
				+ esquinaSuperiorIzquierda 
				+ " y dimensiones: " 
				+ ancho + " ancho, "
				+ alto + " alto.";
	}
	
	//equals
	public boolean equals(Object o)
	{
		if(o == null)
		{
			return false;
		}
		
		if(o == this)
		{
			return true;
		}
		
		if(!(o instanceof Rectangulo))
		{
			return false;
		}
		
		Rectangulo otroRectangulo = (Rectangulo) o; 
		//Hacer Equals para punto
		//Si los puntos son iguales, comparar alto y ancho
		if(this.esquinaSuperiorIzquierda == otroRectangulo.esquinaSuperiorIzquierda
				&& this.alto == otroRectangulo.alto
				&& this.ancho == otroRectangulo.ancho)
		{
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	protected void finalize()
	{
		System.out.println("Adios objeto " + getClass().getName());
		try {
			wait(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
