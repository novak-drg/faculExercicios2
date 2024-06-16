import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a primeira nota do aluno " + i + ": ");
            double nota1 = sc.nextDouble();
            System.out.print("Digite a segunda nota do aluno " + i + ": ");
            double nota2 = sc.nextDouble();
            double media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno " + i + " é: " + media);
        }
    }
}
