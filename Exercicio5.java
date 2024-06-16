
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, count = 0;
        double media;
        System.out.print("Digite um número (0 para sair): ");
        int num = sc.nextInt();
        while (num != 0) {
            soma += num;
            count++;
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
        }
        if (count != 0) {
            media = (double) soma / count;
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade de números digitados: " + count);
            System.out.println("Média: " + media);
        }
    }
}
