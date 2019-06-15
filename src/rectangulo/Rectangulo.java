package rectangulo;

public class Rectangulo {
  
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
		
	
	public  double perimetro() {
		perimetro = 2*altura + 2*base;
		return perimetro;
	}
	public double area() {
		area=  base*altura;
		return area;
	}
}
