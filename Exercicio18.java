
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int senhaCorreta = 1234;
        int senha;
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            if (senha != senhaCorreta) System.out.println("Senha incorreta, tente novamente");
        } while (senha != senhaCorreta);
        System.out.println("Senha correta! Bem-vindo ao sistema");
    }
}
