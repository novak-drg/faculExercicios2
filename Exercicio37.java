import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, count = 0, soma = 0, posMaior = 0, posMenor = 0;
        char continuar;
        do {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            count++;
            soma += num;
            if (num > maior) {
                maior = num;
                posMaior = count;
            }
            if (num < menor) {
                menor = num;
                posMenor = count;
            }
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');
        System.out.println("Maior número: " + maior + ", na posição " + posMaior);
        System.out.println("Menor número: " + menor + ", na posição " + posMenor);
        System.out.println("Quantidade de números informados: " + count);
        System.out.println("Média geral: " + (soma / (double) count));
    }
}