//O programa entrá em um looping infinito.
/*A estrutura de REPEÇÃO for / while examinam a condição de
 término no início do laço de REPETIÇÃO*/
public class Atividade19 {
    static void main(String[] args) {
        while(true){
            System.out.println("Entre com um valor: ");
            int x = new java.util.Scanner(System.in).nextInt();
            if(x % 2 == 0){
                System.out.println("E par!");
            }else{
                System.out.println("E impar!");
            }
        }
    }
}
