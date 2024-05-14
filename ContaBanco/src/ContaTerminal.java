import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        Float saldo = 237.48F;

        while (true) {
            System.out.println("Por favor, digite o numero da Agencia.");
            String agenciaDigitada = scanner.nextLine();

            if (agenciaDigitada.equals(agencia)) {
                System.out
                        .println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                                + agencia + ", conta " + numero + " e seu saldo de R$" + saldo
                                + " já está disponível para saque.");

            } else {
                System.out.println("Agencia digitada incorreta, por favor, verifique seus dados e insira novamente.");
            }
        }
    }
}
