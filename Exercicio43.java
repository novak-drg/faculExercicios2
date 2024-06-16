import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }
        boolean encontrou = false;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > 50) {
                System.out.println("Número maior que 50: " + vetor[i] + " na posição " + i);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Não há números maiores que 50.");
        }
    }
}