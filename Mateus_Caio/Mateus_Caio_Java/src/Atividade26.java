//A primeira posição de um VETOR é zero.
public class Atividade26 {
    static void main(String[] args) {
        int[] idadeAluno = new int[10];
        float[][] notasAlunos = new float[10][3];
        for (int i = 0; i < 10; i++){
            System.out.println("Entre com a nota da AV " +(i+1) +" aluno: ");
            idadeAluno[i] = new java.util.Scanner(System.in).nextInt();
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 3; i++){
                System.out.println("Entre com a nota da AV"+ (j + 1) + "do" + "aluno: ");
                notasAlunos[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }
    }
}
