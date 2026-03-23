public class Exec14 {
    static void main(String[] args) {
        int contadorPrimos = 0;

        for (int n = 1; n <= 1000; n++) {

            int divisores = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                contadorPrimos++;
            }
        }

        System.out.println("Quantidade de números primos: " + contadorPrimos);
    }
}
