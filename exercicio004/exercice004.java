package exercicio004;

public class exercice004 {
    public static void main(String[] args) {

        /*
         * Uma conversão de um tipo menor para um maior, sem preda de dados.
         */

        int numberInt = 10;
        double numberDouble = numberInt; // Conversão Implícita (Widening Cast)

        System.out.println(numberDouble);

        /*
         * Uma conversão de um tipo maior para um menor, poderá haver perda de dados.
         */

        double numberDouble2 = 20.150;
        int numberInt2 = (int) numberDouble2; // Conversão Explícita (Narrowing Cast)

        System.out.println(numberInt2);

    }
}
