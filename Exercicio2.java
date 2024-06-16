
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor18 = 0, entre1865 = 0, maior65 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            if (idade < 18) menor18++;
            else if (idade <= 65) entre1865++;
            else maior65++;
        }
        System.out.println("Menores de 18 anos: " + menor18);
        System.out.println("Entre 18 e 65 anos: " + entre1865);
        System.out.println("Maiores de 65 anos: " + maior65);
    }
}
