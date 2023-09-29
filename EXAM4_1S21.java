import java.util.Scanner;

class Examen4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca un valor que desee para el radio de la circunferencia: ");
        double radio = input.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double longicircu = 2 * Math.PI * radio;

        System.out.println("El area es: " + area);
        System.out.println("La longitud es: " + longicircu);

        input.close();
    }
}
