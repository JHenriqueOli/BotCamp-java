import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /**
         *         var scanner = new Scanner(System.in);
         *         System.out.println("Quanto é 2 + 2?");
         *         var result = scanner.nextInt();
         *         var isRight = result == 4;
         *         System.out.printf("O resultado é 4, você acertou? (%s)", isRight);
         */
        var scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipado = scanner.nextBoolean();
        System.out.println("Você tem habilitação?");
        var isHabilitado = scanner.nextBoolean();
         var canDrive = (age >= 18 && isHabilitado) || (isHabilitado && isEmancipado && age >=16);
         System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
}
