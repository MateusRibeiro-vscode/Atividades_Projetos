import java.util.Scanner;

public class Exec12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int n = entrada.nextInt();


        if (n < 0) {
            System.out.println("Fatorial não definido para números negativos.");
            return;
        }

        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(n + "! = " + fatorial);

        entrada.close();
    }
}
