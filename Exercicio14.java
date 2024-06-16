
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, count = 0, soma = 0, menorIdade = Integer.MAX_VALUE, maiorIdade = Integer.MIN_VALUE;
        do {
            System.out.print("Digite a idade (0 para sair): ");
            idade = sc.nextInt();
            if (idade != 0) {
                count++;
                soma += idade;
                if (idade < menorIdade) menorIdade = idade;
                if (idade > maiorIdade) maiorIdade = idade;
            }
        } while (idade != 0);
        if (count > 0) {
            System.out.println("Número de pessoas: " + count);
            System.out.println("Idade média do grupo: " + (soma / count));
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Maior idade: " + maiorIdade);
        }
    }
}
