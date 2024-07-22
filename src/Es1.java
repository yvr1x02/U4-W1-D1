public class Es1 {
    
    public static void main(String[] args) {

        System.out.println("----Metodo 1 (Moltiplica)----");

        int numero1 = 6;
        int numero2 = 7;
        int prodotto = moltiplica(numero1, numero2);
        System.out.println("Il prodotto di " + numero1 + " e " + numero2 + " è: " + prodotto);

        System.out.println("----Metodo 2 (Concatena)----");

        String testo = "Il numero inserito è: ";
        int numero = 24;
        String risultatoConcatenazione = concatena(testo, numero);
        System.out.println(risultatoConcatenazione);


        System.out.println("----Metodo 3 (Inserisci In Array)----");

        String[] array = {"primo", "secondo", "terzo", "quarto", "quinto"};
        String nuovaStringa = "nuovaStringa";


        String[] risultato = inserisciInArray(array, nuovaStringa);

        for (int i = 0; i < risultato.length; i++) {
            System.out.println(risultato[i]);
        }


    }


    public static int moltiplica(int a, int b) {
        return a * b;
    }


    public static String concatena(String stringa, int numero) {
        return stringa + numero;
    }

    public static String[] inserisciInArray(String[] array, String nuovaStringa) {

        String[] nuovoArray = new String[6];


        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];

        nuovoArray[2] = nuovaStringa;


        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }

}
