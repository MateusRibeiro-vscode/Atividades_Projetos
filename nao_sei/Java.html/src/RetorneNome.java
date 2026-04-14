public class RetorneNome {

    public String nomeAluno() {
        return "Maria Silva";
    }
    public static void main(String[] args) {
        RetorneNome aluno = new RetorneNome();
        System.out.println("Nome do aluno: " + aluno.nomeAluno());
    }


}
