
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, soma = 0, count = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0) {
                soma += num;
                count++;
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
        } while (num != 0);
        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade de números digitados: " + count);
            System.out.println("Média: " + media);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }
}
