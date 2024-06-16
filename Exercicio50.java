import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite 5 números para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = sc.nextInt();
        }
        int[] pares = new int[10];
        int[] impares = new int[10];
        int countPares = 0, countImpares = 0;
        for (int i = 0; i < 10; i++) {
            int soma = vetor1[i];
            for (int j = 0; j < 5; j++) {
                soma += vetor2[j];
            }
            if (soma % 2 == 0) {
                pares[countPares++] = soma;
            } else {
                impares[countImpares++] = soma;
            }
        }
        System.out.println("Primeiro vetor resultante (pares):");
        for (int i = 0; i < countPares; i++) {
            System.out.println(pares[i]);
        }
        System.out.println("Segundo vetor resultante (impares):");
        for (int i = 0; i < countImpares; i++) {
            System.out.println(impares[i]);
        }
    }
}