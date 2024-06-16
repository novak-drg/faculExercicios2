
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprovados = 0, reprovados = 0, exame = 0, totalAlunos = 0;
        double somaMedia = 0;
        char continuar;
        do {
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
            somaMedia += media;
            totalAlunos++;
            if (media < 3) reprovados++;
            else if (media < 7) exame++;
            else aprovados++;
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Exame: " + exame);
        System.out.println("Média da classe: " + (somaMedia / totalAlunos));
    }
}
