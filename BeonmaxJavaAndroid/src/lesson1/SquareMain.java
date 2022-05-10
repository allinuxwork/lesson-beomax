package lesson1;

public class SquareMain {

	public static void main(String[] args) {
		float r =10.8f;
		float pi = 3.14f;
		float s = pi*r*r;
		System.out.println("Площать круга - " + s);

		double a=10;
		double b=20;
		float c = (float) Math.sqrt(a*a+b*b);	
		System.out.println("Площадь треугольника - " + c);
	}

}
