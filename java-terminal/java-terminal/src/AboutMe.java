import java.util.Locale;
import java.util.Scanner;



public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("DDigite  sssua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua  altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Meu nome é " + nome + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("altura = " + altura);


    }
    
}
