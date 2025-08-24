import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * comentario
         * com varias
         * linhas doc
         */

        // comentario de uma linha

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome");
        String name = scanner.next();
        System.out.println("Olá, informe o sua idade");
        int age = scanner.nextInt();
        //System.out.printf("Olá, " + name + "sua idade é " + age);
        System.out.printf("Olá, %s sua idade é %s \n", name, age);
    }
}
