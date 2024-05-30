import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Digite o Número da Agência");
        double Numero = scanner.nextDouble();
    
        System.out.println("Digite sua Agência");
        String Agencia = scanner.next();
        
        System.out.println("Digite seu Nome");
        String Nome_Cliente = scanner.next();

        
        double Saldo = 0.0;


        System.out.println("Olá "+ Nome_Cliente +" , obrigado por criar uma conta em nosso banco,\n sua agência é "+ Agencia +", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");


  
        

    }
}



