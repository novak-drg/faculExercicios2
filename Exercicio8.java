
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do divisor: ");
        int divisor = sc.nextInt();
        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o valor final do intervalo: ");
        int fim = sc.nextInt();
        while (inicio <= fim) {
            if (inicio % divisor == 0) {
                System.out.println(inicio);
            }
            inicio++;
        }
    }
}
