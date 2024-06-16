import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;
        int idadeCandidato1 = 0, idadeCandidato2 = 0, idadeCandidato3 = 0;
        int totalHomens1 = 0, totalHomens2 = 0, totalHomens3 = 0;
        char continuar;
        do {
            System.out.print("Digite o candidato escolhido (1, 2 ou 3): ");
            int candidato = sc.nextInt();
            System.out.print("Digite a idade do eleitor: ");
            int idade = sc.nextInt();
            System.out.print("Digite o sexo do eleitor (1-mulher, 2-homem): ");
            int sexo = sc.nextInt();
            switch (candidato) {
                case 1:
                    votosCandidato1++;
                    idadeCandidato1 += idade;
                    if (sexo == 2) totalHomens1++;
                    break;
                case 2:
                    votosCandidato2++;
                    idadeCandidato2 += idade;
                    if (sexo == 2) totalHomens2++;
                    break;
                case 3:
                    votosCandidato3++;
                    idadeCandidato3 += idade;
                    if (sexo == 2) totalHomens3++;
                    break;
            }
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');
        int vencedor = Math.max(votosCandidato1, Math.max(votosCandidato2, votosCandidato3));
        if (vencedor == votosCandidato1) {
            System.out.println("Candidato mais votado: Candidato 1");
            System.out.println("Média de idade dos eleitores do Candidato 1: " + (idadeCandidato1 / votosCandidato1));
        } else if (vencedor == votosCandidato2) {
            System.out.println("Candidato mais votado: Candidato 2");
            System.out.println("Média de idade dos eleitores do Candidato 2: " + (idadeCandidato2 / votosCandidato2));
        } else {
            System.out.println("Candidato mais votado: Candidato 3");
            System.out.println("Média de idade dos eleitores do Candidato 3: " + (idadeCandidato3 / votosCandidato3));
        }
        System.out.println("Candidato preferido dos homens: " + (totalHomens1 > totalHomens2 ? (totalHomens1 > totalHomens3 ? "Candidato 1" : "Candidato 3") : (totalHomens2 > totalHomens3 ? "Candidato 2" : "Candidato 3")));
    }
}