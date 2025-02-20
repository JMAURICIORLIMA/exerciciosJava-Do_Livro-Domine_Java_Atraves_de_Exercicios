package exercicio003;

public class exercice003 {
    public static void main(String[] args) {

        byte numberByte = 127; // numeros entre -128 e +127.
        short numberShort = 2500; // numeros inteiros com um tamanho "curto".
        int numberInt = 1000666; // numeros inteiros.
        long numberLong = 111222333; // numeros inteiros longos.

        float numberFloat = 50.30f; // numeros com casas decimais.
        double numberDouble = 589038859.98898; // numeros com casas decimais longos.

        boolean typeBoolean = true; // para tipos true (verdadeiro) ou false (falso).

        char caracter = 'A'; // caractere unicode ou caractere único.

        System.out.println("Byte: " + numberByte);
        System.out.println("Short: " + numberShort);
        System.out.println("Int: " + numberInt);
        System.out.println("Long: " + numberLong);
        System.out.println("float: " + numberFloat);
        System.out.println("Double: " + numberDouble);
        System.out.println("Boolean: " + typeBoolean);
        System.out.println("Char: " + caracter);

    }
}
