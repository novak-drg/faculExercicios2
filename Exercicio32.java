import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int motoristasMenor25 = 0, motoristasMulheres = 0, motoristasForaSP = 0, totalMotoristas = 0;
        char continuar;
        do {
            System.out.print("Digite o ano de nascimento do motorista: ");
            int anoNascimento = sc.nextInt();
            System.out.print("Digite o sexo do motorista (1-mulher, 2-homem): ");
            int sexo = sc.nextInt();
            System.out.print("Digite o código de registro (1-SP, 0-Outros): ");
            int registro = sc.nextInt();
            int idade = 2024 - anoNascimento;
            if (idade < 25) motoristasMenor25++;
            if (sexo == 1) motoristasMulheres++;
            if (registro == 0) motoristasForaSP++;
            totalMotoristas++;
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');
        System.out.println("Percentagem de motoristas com menos de 25 anos: " + (motoristasMenor25 * 100.0 / totalMotoristas) + "%");
        System.out.println("Percentagem de mulheres: " + (motoristasMulheres * 100.0 / totalMotoristas) + "%");
        System.out.println("Percentagem de motoristas com registro fora de SP: " + (motoristasForaSP * 100.0 / totalMotoristas) + "%");
    }
}