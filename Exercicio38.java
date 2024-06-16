import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int somaDivisores = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    somaDivisores += j;
                }
            }
            if (somaDivisores == i) {
                System.out.println(i + " é um número perfeito.");
            }
        }
    }
}