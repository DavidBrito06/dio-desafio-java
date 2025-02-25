import java.util.Scanner;
import java.text.MessageFormat;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();


        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo");
        String saldo = scanner.next();  

        

        String mensagem = MessageFormat.format(" Olá {0} obrigado por criar uma conta em nosso banco , sua agência é {1}, o seu numero da conta {2} e seu saldo {3} já está disponível para saque", nome,agencia,numero,saldo);
        System.out.println(mensagem);

    }
}
