public class Exec7 {
    static void main(String[] args) {
        System.out.println("Digita um numero: ");
        int x = new java.util.Scanner(System.in).nextInt();

        System.out.println("Digita um numero: ");
        int y = new java.util.Scanner(System.in).nextInt();

        if (x > y ){
            System.out.println("Maior " + x);
        }else{
            if (y>x){
                System.out.println("Maior " + y);
            }else {
                System.out.println("ambos sao iguais ");
            }
        }
    }
}
