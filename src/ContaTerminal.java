import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua agencia: ");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Digite a sua agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
