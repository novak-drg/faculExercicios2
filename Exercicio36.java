import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alunosTerceiroAno = 0, maiorLivrosSegundaSerie = 0, totalLivros = 0, totalAlunos = 0, naoGostamRedacaoPrimeiroAno = 0, totalPrimeiroAno = 0;
        char continuar;
        do {
            System.out.print("Digite o ano (1, 2, 3): ");
            int ano = sc.nextInt();
            System.out.print("Digite a quantidade de livros lidos por mês: ");
            int livros = sc.nextInt();
            System.out.print("Gosta de fazer redação? (1-Sim, 0-Não): ");
            int gostaRedacao = sc.nextInt();
            if (ano == 3) alunosTerceiroAno++;
            if (ano == 2 && livros > maiorLivrosSegundaSerie) maiorLivrosSegundaSerie = livros;
            if (ano == 1) totalPrimeiroAno++;
            if (ano == 1 && gostaRedacao == 0) naoGostamRedacaoPrimeiroAno++;
            totalLivros += livros;
            totalAlunos++;
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');
        System.out.println("Quantidade de alunos no terceiro ano: " + alunosTerceiroAno);
        System.out.println("Maior quantidade de livros lidos por um aluno da segunda série: " + maiorLivrosSegundaSerie);
        System.out.println("Média de livros lidos pelos alunos: " + (totalLivros / (double) totalAlunos));
        System.out.println("Porcentagem de alunos do primeiro ano que não gostam de fazer redação: " + (naoGostamRedacaoPrimeiroAno * 100.0 / totalPrimeiroAno) + "%");
    }
}
