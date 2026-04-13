public class MetodoscomParametros {
    public void imprimirNome(String nome) {
        System.out.println("Nome recebido: " + nome);
    }
    public static void main(String[] args) {
        MetodoscomParametros imp = new MetodoscomParametros();
        imp.imprimirNome("João");
    }
}

