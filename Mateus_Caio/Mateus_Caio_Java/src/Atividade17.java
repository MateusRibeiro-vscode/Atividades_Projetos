//Estruturas de repetição e operadores.
/*A estrutura de REPETIÇÃO for / while examinam
  a condição de término no início do laço de REPETIÇÃO.*/
/*Esse código entrario em um loop infinito, se não houvesse
  controle sobre a variável "i" e exibiria apenas o 1.*/
/*Caso coloque "i++" no método System.out.printn ou na linha
  seguinte, então o programa sai do loop e exibe se 1 a 10.*/
public class Atividade17 {
    static void main(String[] args) {
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
