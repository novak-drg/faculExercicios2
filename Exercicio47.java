import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] intercalado = new int[20];
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }
        for (int i = 0, j = 0; i < 10; i++) {
            intercalado[j++] = vetor1[i];
            intercalado[j++] = vetor2[i];
        }
        System.out.println("Vetor intercalado:");
        for (int num : intercalado) {
            System.out.println(num);
        }
    }
}