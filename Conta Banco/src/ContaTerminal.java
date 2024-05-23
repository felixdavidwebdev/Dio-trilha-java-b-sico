import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler informações da conta do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibir mensagem de confirmação com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); // Fechar o scanner
    }
}
