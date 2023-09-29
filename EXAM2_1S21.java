import java.util.Scanner;

class Examen2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final double PI = 3.1416;

        System.out.println("Ingrece un valor: ");
        double grados = scanner.nextDouble();

        double radianes = grados * (PI / 180);

        System.out.println(grados + "° en radianes es:  " + radianes );

        scanner.close();
    }
}