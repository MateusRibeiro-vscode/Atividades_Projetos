public class MetodosGetterseSetters {
    //São métodos especiais que acessam e modificam atributos privados das classes.
    private String nome;
    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Getter
    public String getNome() {
        return nome;
    }
    public static void main(String[] args) {
        MetodosGetterseSetters pessoa = new MetodosGetterseSetters();
        pessoa.setNome("Ana");
        System.out.println("Nome: " + pessoa.getNome());
    }
}

