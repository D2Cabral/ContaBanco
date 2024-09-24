import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Por favor, digite o numero da conta:");
            int numero = scanner.nextInt();
            
            System.out.println("Informar o numero da Agência");
            String agencia = scanner.next();
            
            System.out.println("Informe o seu Nome");
            String nomeCliente = scanner.next();
            
            System.out.println("Informe o seu Saldo");
            double saldo = scanner.nextDouble();
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                    "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo
                    + " já está disponivel para saque.");
        }

    }

}
