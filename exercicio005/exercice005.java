package exercicio005;

public class exercice005 {

    public static void main(String[] args) {

        int num01 = 4;
        int num02 = 10;

        int sum = num01 + num02;
        int subtraction = num02 - num01;
        int division = num02 / num01;
        int multiplication = num01 * num02;
        int module = num02 % num01;

        System.out.println("A soma entre: " + num01 + " e " + num02 + " = " + sum);
        System.out.println("A subtração entre: " + num02 + " e " + num01 + " = " + subtraction);
        System.out.println("A divisão entre: " + num02 + " e " + num01 + " = " + division);
        System.out.println("A multiplicação entre: " + num01 + " e " + num02 + " = " + multiplication);
        System.out.println("O resto da divisão entre: " + num02 + " e " + num01 + " = " + module);
    }
}
