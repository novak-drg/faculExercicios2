
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim;
        do {
            System.out.print("Digite o valor inicial: ");
            inicio = sc.nextInt();
            System.out.print("Digite o valor final: ");
            fim = sc.nextInt();
        } while (inicio >= fim);
        while (inicio <= fim) {
            System.out.println(inicio);
            inicio++;
        }
    }
}
