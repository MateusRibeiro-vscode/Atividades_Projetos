import java.util.Scanner;   // ← Importa a classe Scanner (boa prática)

public class Exec8 {
    public static void main(String[] args) {   // Correto: public static void main

        // Cria UM Scanner só (mais eficiente)
        Scanner entrada = new Scanner(System.in);

        // Pede e lê o primeiro número
        System.out.print("Valor de A: ");
        int a = entrada.nextInt();

        System.out.print("Valor de B: ");
        int b = entrada.nextInt();

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        int maior = (a > b) ? a : b;

        System.out.println("Maior: " + maior);

        entrada.close();
    }
}