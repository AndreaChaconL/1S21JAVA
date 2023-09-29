class Examen1{
    public static void main(String[] args) {
        int colum = 9;
        int fil = 4;

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < colum; j++) {
                if (i == 0 || i == fil - 1 || j == 0 || j == colum - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}