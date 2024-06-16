
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();
        double soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            double num = sc.nextDouble();
            soma += num;
        }
        double media = soma / n;
        System.out.println("Média dos números: " + media);
    }
}
