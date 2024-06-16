
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goias = 0, vilaNova = 0, outros = 0, total = 0;
        char time;
        do {
            System.out.print("Digite o time do torcedor (G - Goiás, V - Vila Nova, O - Outros, F - Fim): ");
            time = sc.next().charAt(0);
            switch (time) {
                case 'G':
                    goias++;
                    break;
                case 'V':
                    vilaNova++;
                    break;
                case 'O':
                    outros++;
                    break;
            }
            total++;
        } while (time != 'F');
        System.out.println("Total de torcedores entrevistados: " + (total - 1));
        System.out.println("Torcedores do Goiás: " + goias);
        System.out.println("Torcedores do Vila Nova: " + vilaNova);
        System.out.println("Torcedores de Outros times: " + outros);
    }
}
