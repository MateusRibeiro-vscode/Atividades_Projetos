//Construtor é um método especial usado para inicializar objetos.
public class MetodosConstrutoreseDestrutoresConstrutores {
    String nome;
    // Método construtor
    public MetodosConstrutoreseDestrutoresConstrutores(String nome) {
        this.nome = nome;
    }
    public void exibirAluno() {
        System.out.println("Aluno: " + nome);
    }
    public static void main(String[] args) {
        MetodosConstrutoreseDestrutoresConstrutores aluno = new MetodosConstrutoreseDestrutoresConstrutores("Pedro");
        aluno.exibirAluno();
    }
}
