
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, pares = 0, impares = 0;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Número inválido");
            } else if (num > 0) {
                if (num % 2 == 0) pares++;
                else impares++;
            }
        } while (num != 0);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
