import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        } catch (java.util.InputMismatchException e) {
            System.out.println("O programa esperava o valor do tipo numérico inteiro para a idade e decimal para altura.");
        } finally {
            scanner.close(); 
        }
    }
}
