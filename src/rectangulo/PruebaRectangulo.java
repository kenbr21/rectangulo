package rectangulo;

import java.util.Scanner;

public class PruebaRectangulo {

	public static void main(String[] args) {
		  double base=0;
		  double altura=0;
		  int confir=0;
		  Scanner reader = new Scanner(System. in);
			
		  Rectangulo r = new Rectangulo(base, altura);
		
		do {  
		System.out.print("Base del rectangulo: ");
		base = reader.nextDouble();
		System.out.println("------------------------");
		r.setBase(base);
		System.out.print("Altura del rectangulo: ");
		altura = reader.nextDouble();
		System.out.println("------------------------");
		r.setAltura(altura);
		System.out.println("------------------------");
		System.out.println("--------RECTANGULO--------");
		System.out.println("------------------------");
		System.out.println("Area del rectangulo: " + r.area());	
		System.out.println("Perimetro del rectangulo: " + r.perimetro());	
		System.out.println("-------------------------");	
		System.out.println("desea crear otro rectangulo?(si=1/no=2)");
		System.out.println("-------------------------");	
		confir= reader.nextInt();
		reader.nextLine();
		}while(confir==1);
	}
}
