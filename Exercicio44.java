import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }
        int menor = vetor[0], maior = vetor[0], posMenor = 0, posMaior = 0;
        for (int i = 1; i < 10; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }
        System.out.println("O menor elemento do vetor é " + menor + " e sua posição dentro do vetor é: V[" + posMenor + "]");
        System.out.println("O maior elemento do vetor é " + maior + " e sua posição dentro do vetor é: V[" + posMaior + "]");
    }
}