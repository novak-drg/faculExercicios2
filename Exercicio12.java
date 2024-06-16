
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.print("Digite o primeiro número (n1): ");
            n1 = sc.nextInt();
            System.out.print("Digite o segundo número (n2): ");
            n2 = sc.nextInt();
        } while (n1 >= n2);
        for (int i = n1 + 1; i < n2; i++) {
            System.out.println(i);
        }
    }
}
