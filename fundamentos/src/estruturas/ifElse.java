package estruturas;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe a sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipado = scanner.next().equalsIgnoreCase("s");

        /*if (age >= 18) {
            System.out.println("bem vindo");
            System.out.printf("%s, você tem %s anos, você pode dirigir\n", name, age);
        } else if (age >= 16 && isEmancipado) {
            System.out.printf("Você tem tem %s anos e é emancipado, você pode dirigir.\n", age);
        } else {
            System.out.printf("%s, você não pode dirigir. \n", name);
        }
            System.out.println("Fim da execução.");
         */
        /*
        var canDrive = (age >= 18) ||  (age >= 16 && isEmancipado);
        var mensagem = "";
        if (canDrive) {
            mensagem = name + " Você pode dirigir.\n";
        } else {
            mensagem = name + " Você não pode dirigir.\n";
        }
         */
        var canDrive = (age >= 18) ||  (age >= 16 && isEmancipado);
        var mensagem = canDrive ?
                name + ", você pode dirigir\n":
                name + ", você não pode dirigir.\n";

        System.out.println(mensagem);
        System.out.println("Fim do programa.");
    }
}
