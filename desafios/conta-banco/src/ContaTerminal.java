import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Vamos criar a sua conta!");

        //Obter pela scanner os valores digitados no terminal
        System.out.println("por favor digite o numero da conta:");
        var numeroConta = scanner.nextInt();
        System.out.println("por favor digite o número da agência:");
        String agencia = scanner.next();
        System.out.println("por favor digite o seu nome:");
        String name = scanner.next();
        System.out.println("quanto deseja depositar?");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", name, agencia, numeroConta, saldo);
    }
}