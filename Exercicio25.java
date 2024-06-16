import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número entre 1 e 10: ");
            num = sc.nextInt();
        } while (num < 1 || num > 10);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}