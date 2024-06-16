import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int somaDivisores = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == num) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num + " não é um número perfeito.");
        }
    }
}