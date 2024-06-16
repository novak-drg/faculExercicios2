import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;
        do {
            System.out.print("Digite a matrícula do vendedor: ");
            int matricula = sc.nextInt();
            System.out.print("Digite o número de carros vendidos: ");
            int carrosVendidos = sc.nextInt();
            double salario = 1500;
            if (carrosVendidos <= 10) {
                salario += carrosVendidos * 100;
            } else {
                salario += carrosVendidos * 200;
            }
            for (int i = 0; i < carrosVendidos; i++) {
                System.out.print("Digite o valor do carro " + (i + 1) + ": ");
                double valorCarro = sc.nextDouble();
                if (valorCarro > 50000) {
                    salario += valorCarro * 0.01;
                }
            }
            System.out.println("Salário do vendedor " + matricula + ": R$" + salario);
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');
    }
}
