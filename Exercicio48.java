import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] divis = new int[5];
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Digite 5 números para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            divis[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + num[i] + ":");
            for (int j = 0; j < 5; j++) {
                if (num[i] % divis[j] == 0) {
                    System.out.println("Divisível por " + divis[j] + " na posição " + j);
                }
            }
        }
    }
}