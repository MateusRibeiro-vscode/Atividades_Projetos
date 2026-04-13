public class MetodoscomRetorno {
    public String nomeAluno() {
        return "Maria Silva";
    }
    public static void main(String[] args) {
        MetodoscomRetorno aluno = new MetodoscomRetorno();
        System.out.println("Nome do aluno: " + aluno.nomeAluno());
    }
}

