import java.util.Scanner;

class examen_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        final double PI = 3.1416;

        System.out.print("Ingrese un valor que desee para el radio: ");
        double radio = scanner.nextDouble();

        double volumen = (4.0 / 3.0) * PI * Math.pow(radio, 3);

        System.out.println("El volumen es de: " + radio + "° es: " + volumen);

        scanner.close();
    }
}