
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login, senha;
        int tentativas = 0;
        System.out.print("Digite o login: ");
        login = sc.next();
        final String senhaCorreta = "1234";
        do {
            System.out.print("Digite a senha: ");
            senha = sc.next();
            if (!senha.equals(senhaCorreta)) {
                tentativas++;
                if (tentativas >= 3) {
                    System.out.println("ACESSO BLOQUEADO, PROCURE UM MODERADOR!");
                    return;
                } else {
                    System.out.println("SENHA INCORRETA, TENTE NOVAMENTE");
                }
            }
        } while (!senha.equals(senhaCorreta));
        System.out.println("BEM-VINDO AO SISTEMA, " + login);
    }
}
