
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + num + " é: " + fatorial);
    }
}
