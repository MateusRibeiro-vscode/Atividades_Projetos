import java.util.Scanner;

    public class Exec15 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o tamanho da matriz: ");
            int n = sc.nextInt();

            int[][] matriz = new int[n][n];

            // Lendo a matriz
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }

            // Mostrando a diagonal principal
            System.out.println("Diagonal principal:");
            for (int i = 0; i < n; i++) {
                System.out.print(matriz[i][i] + " ");
            }
        }
}
