import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base (x): ");
        int x = entrada.nextInt();

        System.out.print("Digite o expoente (y): ");
        int y = entrada.nextInt();

        if (y < 0) {
            System.out.println("Este programa calcula apenas expoentes não negativos.");
            return;
        }

        long resultado = 1;

        for (int i = 1; i <= y; i++) {
            resultado *= x;
        }

        System.out.println(x + " elevado a " + y + " = " + resultado);

        entrada.close();
    }
}
