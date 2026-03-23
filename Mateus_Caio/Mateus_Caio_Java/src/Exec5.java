public class Exec5 {
    static void main(String[] args) {
        System.out.println("Digita a sua Velocidade: ");
        int velocidade = new java.util.Scanner(System.in).nextInt();

        System.out.println("Digita o tempo de viagem: ");
        int tempo = new java.util.Scanner(System.in).nextInt();

        System.out.println("A distencia é "+ velocidade * tempo);
    }
}
