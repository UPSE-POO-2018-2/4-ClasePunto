package ec.edu.upse.facsistel.informatica.poo.punto;

public class Punto {
	
	private int x;
	private int y;
	
	public Punto(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
//	public void setX(int x)
//	{
//		this.x = x;
//	}
//	
	public int getY()
	{
		return y;
	}
	
//	public void setY(int y)
//	{
//		this.y = y;
//	}
	
	public String toString()
	{
		String puntoString = "Punto en x: " + x + ", y:" + y;
		return puntoString;
	}
	
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		
		if(o == this)
			return true;
		
		if(!(o instanceof Punto))
			return false;
		
		Punto otroPunto = (Punto) o;
		if(this.x == otroPunto.getX() &&
				this.y == otroPunto.getY())
		{
			return true;
		}else {
			return false;
		}
	}
}
