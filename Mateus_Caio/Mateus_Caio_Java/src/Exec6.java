public class Exec6 {
    static void main(String[] args) {
        double x1,x2,y1,y2,resultado;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite um primeiro valor:  ");
        x1 = sc.nextDouble();

        System.out.print("Digite um segundo valor:  ");
        y1 = sc.nextDouble();

        System.out.print("Digite um terceiro valor:  ");
        x2 = sc.nextDouble();

        System.out.print("Digite um quarto e ultimo valor: ");
        y2 = sc.nextDouble();

        resultado = Math.sqrt( (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));

        System.out.printf("A distancia entre o ponto A e B é de %.2f", resultado);

    }
}

