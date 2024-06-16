import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();
        System.out.print("Digite o valor de P: ");
        int p = sc.nextInt();
        System.out.println("Arranjo de " + n + " tomados de " + p + " a " + p + ": " + arranjo(n, p));
        System.out.println("Combinação de " + n + " tomados de " + p + " a " + p + ": " + combinacao(n, p));
    }

    public static int fatorial(int num) {
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int arranjo(int n, int p) {
        return fatorial(n) / fatorial(n - p);
    }

    public static int combinacao(int n, int p) {
        return arranjo(n, p) / fatorial(p);
    }
}
