package ec.edu.upse.facsistel.informatica.poo.practica_figuras;

import ec.edu.upse.facsistel.informatica.poo.figuras.Rectangulo;
import ec.edu.upse.facsistel.informatica.poo.punto.Punto;

public class PracticaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(3, 3);
		Punto p2 = new Punto(5,5);
		Rectangulo r = new Rectangulo(p1, p2);
		System.out.println(r);
		
		int i = 0;
		do {
			Punto p3 = p1;
			Punto p4 = p2;
			Rectangulo rx = r;
			System.out.println(i);
			i++;
		}while(true);
	}

}
