/*A estruturo de REPETIÇÃO for / do - while examinom a condição de término
de REPETIÇÃO ao final do laço.*/
public class Atividade23 {
    static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Entre com a opcao desejada! ");
            System.out.println("1 - Pratos");
            System.out.println("2 - Bebidas");
            System.out.println("3 - Encerre sua conta e saia do programa");
            opcao = new java.util.Scanner(System.in).nextInt();
            switch (opcao){
                case 1:{
                    System.out.println("*Hamburguer Artesanal");
                    System.out.println("*Pizza à moda da casa");
                    System.out.println("*Batata Recheada");
                    break;
                }
                case 2:{
                    System.out.println("*Agua");
                    System.out.println("*Refrigerante");
                    System.out.println("*Cerveja");
                    break;
                }
                case 3:{
                    System.out.println("Conta encerrada");
                    break;
                }
                default:{
                    System.out.println("Opcao invalida");
                }
            }
        }while(opcao != 3);//Troque a comparação por igualdade, para entender a negação
    }
}
 //esta com erro