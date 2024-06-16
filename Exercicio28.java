import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroGordo = 0, numeroMagro = 0;
        double pesoGordo = 0, pesoMagro = Double.MAX_VALUE;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número do boi " + i + ": ");
            int numero = sc.nextInt();
            System.out.print("Digite o peso do boi " + i + ": ");
            double peso = sc.nextDouble();
            if (peso > pesoGordo) {
                pesoGordo = peso;
                numeroGordo = numero;
            }
            if (peso < pesoMagro) {
                pesoMagro = peso;
                numeroMagro = numero;
            }
        }
        System.out.println("Boi mais gordo: Número " + numeroGordo + ", Peso " + pesoGordo);
        System.out.println("Boi mais magro: Número " + numeroMagro + ", Peso " + pesoMagro);
    }
}