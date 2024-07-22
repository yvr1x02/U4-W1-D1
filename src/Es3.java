import java.util.Scanner;

public class Es3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo lato del rettangolo");
        double lato1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo lato del rettangolo");
        double lato2 = scanner.nextDouble();

        double perimetro = perimetroRettangolo(lato1, lato2);

        System.out.println("il perimetro del rettangolo è: " + perimetro);


        System.out.println("inserisci un numero per verificare se è pari (0) o dispari (1)");

        int num1 = scanner.nextInt();

        System.out.println(pariDispari(num1));


        System.out.println("inserisci latoA per calcolare l'area del triangolo");
        double latoA = scanner.nextDouble();

        System.out.println("inserisci latoB per calcolare l'area del triangolo");
        double latoB = scanner.nextDouble();

        System.out.println("inserisci latoC per calcolare l'area del triangolo");
        double latoC = scanner.nextDouble();

        System.out.println("l'area del triangolo è: " + areaTriangolo(latoA, latoB, latoC));


        scanner.close();
    }

    public static double perimetroRettangolo(double lato1, double lato2) {


        return (lato1 + lato2) * 2;

    }

    public static int pariDispari(int num1) {

        if (num1 % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(double latoA, double latoB, double latoC) {
        double semiPerimetro = (latoA + latoB + latoC) / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - latoA) * (semiPerimetro - latoB) * (semiPerimetro - latoC));
        return area;
    }

}
