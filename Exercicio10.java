
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Digite um número positivo (0 para sair): ");
        int num = sc.nextInt();
        while (num > 0) {
            count++;
            System.out.print("Digite um número positivo (0 para sair): ");
            num = sc.nextInt();
        }
        System.out.println("Quantidade de números digitados: " + count);
    }
}
