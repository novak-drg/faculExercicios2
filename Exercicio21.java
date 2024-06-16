
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[10];
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextDouble();
        }
        int codigo;
        do {
            System.out.print("Digite o código (0 para sair, 1 para ordem direta, 2 para ordem inversa): ");
            codigo = sc.nextInt();
            switch (codigo) {
                case 1:
                    System.out.println("Vetor na ordem direta:");
                    for (double v : vetor) {
                        System.out.println(v);
                    }
                    break;
                case 2:
                    System.out.println("Vetor na ordem inversa:");
                    for (int i = vetor.length - 1; i >= 0; i--) {
                        System.out.println(vetor[i]);
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Código inválido.");
            }
        } while (codigo != 0);
    }
}
