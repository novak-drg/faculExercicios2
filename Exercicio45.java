import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[15];
        System.out.println("Digite 15 números:");
        for (int i = 0; i < 15; i++) {
            int num = sc.nextInt();
            vetor[i] = num >= 0 ? Math.sqrt(num) : -1;
        }
        System.out.println("Raízes ou -1 para valores negativos:");
        for (double v : vetor) {
            System.out.println(v);
        }
    }
}