
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        do {
            System.out.print("Digite a primeira nota: ");
            nota1 = sc.nextDouble();
            if (nota1 < 0 || nota1 > 10) System.out.println("Nota inválida. Digite novamente.");
        } while (nota1 < 0 || nota1 > 10);
        do {
            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextDouble();
            if (nota2 < 0 || nota2 > 10) System.out.println("Nota inválida. Digite novamente.");
        } while (nota2 < 0 || nota2 > 10);
        media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);
    }
}
