//O programa só será encerrado quando a entrada for um valor impar.
/*A estrutura de REPETIÇÃO for  while examinam a condição de
  término no início do laço de REPETIÇÃO.*/
public class Atividade18 {
    static void main(String[] args) {
        boolean impar = false;
        while (impar == false){
            System.out.println("Entre com um valor para x: ");
            int x = new java.util.Scanner(System.in).nextInt();
            if(x % 2 == 0){
                System.out.println("E par!");
            }else{
                System.out.println("E impar!");
            }
        }
    }
}
