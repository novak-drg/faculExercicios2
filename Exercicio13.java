
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número entre 1 e 5: ");
            num = sc.nextInt();
            if (num < 1 || num > 5) {
                System.out.println("Entrada Inválida");
            }
        } while (num < 1 || num > 5);
        System.out.println("Parabéns! O número digitado foi " + num);
    }
}
