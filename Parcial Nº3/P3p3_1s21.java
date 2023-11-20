import java.util.Scanner;

public class P3p3_1s21 {
	static int veces;
	public static void elevacion(int a,int contador){
		if (!(contador == veces)) elevacion(a*2,contador+1);
		else System.out.println("El valor es: " + a);
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantas veces deseas repetir:");
		veces = teclado.nextInt();
		int valor = 2;
		elevacion(valor,1);

	}
}