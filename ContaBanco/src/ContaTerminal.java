import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner 50 = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da conta: ");

        conta.Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");

        scanner.nextLine();

        conta.Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");

        conta.NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial da conta: ");

        conta.Saldo = scanner.nextDouble();

        System.out.println("Olá " + conta.NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.Agencia + ", conta " + conta.Numero + " e seu saldo R$" + conta.Saldo + " já está disponível para saque." );

        scanner.close();
    }
}
