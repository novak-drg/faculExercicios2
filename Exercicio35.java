import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 112; i++) {
            System.out.print("Digite o número da amostra: ");
            int amostra = sc.nextInt();
            System.out.print("Digite o conteúdo de carbono (%): ");
            double carbono = sc.nextDouble();
            System.out.print("Digite a dureza de Rockwell: ");
            int dureza = sc.nextInt();
            System.out.print("Digite a resistência à tração (psi): ");
            int tracao = sc.nextInt();
            int grau;
            if (carbono < 7 && dureza > 50 && tracao > 80000) {
                grau = 10;
            } else if (carbono < 7 && dureza > 50) {
                grau = 9;
            } else if (carbono < 7) {
                grau = 8;
            } else {
                grau = 7;
            }
            System.out.println("Amostra " + amostra + ": Grau " + grau);
        }
    }
}