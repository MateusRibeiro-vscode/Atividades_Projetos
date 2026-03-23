 import java.util.Scanner;

    public class Exec16 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o tamanho da matriz: ");
            int n = sc.nextInt();

            int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }


            System.out.println("Diagonal secundária:");
            for (int i = 0; i < n; i++) {
                System.out.print(matriz[i][n - 1 - i] + " ");
            }
        }
    }

