public class Exercicio41 {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x = (int) Math.pow(Math.sqrt(x) + 1, 2)) {
            for (int y = 0; y <= 5; y++) {
                System.out.println("x: " + x + ", y: " + y);
            }
        }
    }
}
