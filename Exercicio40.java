import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        int mmc = (n1 > n2) ? n1 : n2;
        while (mmc % n1 != 0 || mmc % n2 != 0) {
            mmc++;
        }
        System.out.println("Mínimo múltiplo comum de " + n1 + " e " + n2 + " é: " + mmc);
    }
}