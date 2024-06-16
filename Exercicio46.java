public class Exercicio46 {
    public static void main(String[] args) {
        int[] pares = new int[100];
        int[] impares = new int[200];
        for (int i = 0, p = 2; i < 100; i++, p += 2) {
            pares[i] = p;
        }
        for (int i = 0, p = 1; i < 200; i++, p += 2) {
            impares[i] = p;
        }
        System.out.println("Primeiros 100 números pares:");
        for (int par : pares) {
            System.out.println(par);
        }
        System.out.println("Primeiros 200 números ímpares:");
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}
