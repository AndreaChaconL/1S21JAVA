import java.util.Scanner;
import java.lang.Math;

class Examen6{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		int x;
		int y;
		int a;
		int b;
		int c;
		int resultado;
		double distancia;
		double raizAB;
		System.out.println("Calcula el valor de las distancias que hay entre 2 puntos ");
		System.out.println("Introduce las coordenadas del punto X: ");
		x = teclado.nextInt();
		System.out.println("Introduce las cordenadas del punto Y: ");
		y = teclado.nextInt();
		System.out.println("Introduce el valor de A: ");
		a = teclado.nextInt();
		System.out.println("Introduce el valor de B: ");
		b = teclado.nextInt();
		System.out.println("Introduce el valor de C: ");
		c = teclado.nextInt();
		resultado = Math.abs(a*x + b*y + c);
		raizAB = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		System.out.println("El valor de la distancia es: " + resultado);
	}
}