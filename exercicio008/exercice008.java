package exercicio008;

import java.beans.XMLEncoder;
import java.util.Scanner;

public class exercice008 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Digite seu primeiro nome: ");
        String firstName = input.nextLine();

        System.out.print("Digite seu segundo nome: ");
        String lastName = input.nextLine();

        String message = "Bem vindo(a), " + firstName + " " + lastName + "!";

        System.out.println(message);

    }
}
