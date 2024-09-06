import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int NumUser;
        String Agencia, Cliente;
        double Saldo;
        System.out.println("Seja Bem Vindo!");
        System.out.println("Digite o seu nome completo:");
        Cliente = sc.nextLine();
        System.out.println("Digite o numero da sua agencia:");
        Agencia = sc.next();
        System.out.println("Digite o numero da sua conta:");
        NumUser = sc.nextInt();
        System.out.println("Digite o seu saldo:");
        Saldo = sc.nextDouble();
        System.out.println("\nOla "+Cliente+",obrigado por criar uma conta em nosso banco,\nsua agência é "+Agencia+",conta "+NumUser+"\ne seu saldo de R$"+Saldo+" Já está disponivel para saque.\n");
    }
}
