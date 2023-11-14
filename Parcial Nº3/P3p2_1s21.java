import java.util.Scanner;

public class P3p2_1s21{
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Resta de 2 numeros");
		System.out.println("Ingrese el primer numero");
		int a = teclado.nextInt();
		System.out.println("Ingrese el seguno numero");
		int b = teclado.nextInt();
		int c = a-b;
		System.out.println("La suma fue: " +c);
	}
}