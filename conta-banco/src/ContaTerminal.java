import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:conhecer e importar a clase scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner osss valore digitados no terminal

        //Exibir a mensagem conta criada
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

         System.out.println("Por favor, digite o numero a Agência! ");
         int numero = scanner.nextInt();

         System.out.print("Por favor, digite a Agência! ");
         String agencia = scanner.next();

         scanner.nextLine();

         System.out.print("Por favor, digite o seu nome: ");
         String nome = scanner.nextLine();

         System.out.print("Por favor, digite o seu saldo: ");
         Double saldo = scanner.nextDouble();

         System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disssponivel para saque.");



        


        



        
    }
}
