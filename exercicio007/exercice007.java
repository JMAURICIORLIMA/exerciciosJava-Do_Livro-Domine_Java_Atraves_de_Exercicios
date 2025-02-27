package exercicio007;

import java.util.Scanner;

public class exercice007 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite apenas um valor inteiro: ");
        int numberInt = input.nextInt();
        System.out.print("Agora digite apenas um valor decimal, usando a vigula (,) como separador.: ");
        double numberDouble = input.nextDouble();

        System.out.println("Você digitou " + numberInt + " para número inteiro.");
        System.out.println("Você digitou " + numberDouble + " para número decimal.");

    }
}
