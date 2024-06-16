
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if (num > maior) maior = num;
            if (num < menor) menor = num;
            soma += num;
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + (soma / 10.0));
    }
}
