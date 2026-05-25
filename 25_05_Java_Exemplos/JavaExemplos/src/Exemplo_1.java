class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Nome: "+nome+", Idade: "+idade);

    }
}

public class Exemplo_1 {
    public static void main(String[]args){
        Pessoa p = new Pessoa("Mateus",17);
        p.apresentar();
    }
}
