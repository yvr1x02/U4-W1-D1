import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        System.out.println("--------------Esercizio 2-------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la prima stringa");

        String stringa1 = scanner.nextLine();

        System.out.println("inserisci la seconda stringa");
        String stringa2 = scanner.nextLine();

        System.out.println("inserisci la terza stringa");
        String stringa3 = scanner.nextLine();

        String ConcatOrder = stringa1 + " " + stringa2 + " " + stringa3;

        String ConcatUnorder = stringa3 + " " + stringa2 + " " + stringa1;


        System.out.println("Concatenazione in ordine:" + ConcatOrder);
        System.out.println("Concatenazione inverso:" + ConcatUnorder);


    }

}






