import java.util.Scanner;

class P4_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("ingresa tu nombre ");
		cadena = teclado.nextLine();
		System.out.println("Bienvenido " + cadena + ", a la clase");
		System.out.println("ingresa tu edad ");
		cadena = teclado.nextLine();
		System.out.println("Edad:  " + cadena );
		System.out.println("ingresa tu correo electronico ");
		cadena = teclado.nextLine();
		System.out.println("Correo electronico:  " + cadena );
		System.out.println("ingresa tu numero telefonico");
		cadena = teclado.nextLine();
		System.out.println("Numero telefonico:  " + cadena );
	}