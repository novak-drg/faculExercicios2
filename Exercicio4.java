
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;
        do {
            System.out.print("Digite o nome: ");
            String nome = sc.next();
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.println("O usuário " + nome + " tem " + idade + " anos de vida.");
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));
    }
}
