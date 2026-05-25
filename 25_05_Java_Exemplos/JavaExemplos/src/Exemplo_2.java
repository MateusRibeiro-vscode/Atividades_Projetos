abstract class Funcionario{
    protected String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }
    public void mostrarNome(){
        System.out.println("Funcionário: "+nome);
    }
    public abstract double calcularSalario();
}
class Funcionarioclt extends Funcionario{
    private double salarioBase;

    public Funcionarioclt(String nome, double salarioBase){
        super(nome);
        this.salarioBase = salarioBase;
    }
    @Override
    public double calcularSalario(){
        return salarioBase;
    }
}
public class Exemplo_2 {
    static void main(String[] args) {
        Funcionario f = new Funcionarioclt("Mateus",3500.0);
        f.mostrarNome();
        System.out.println("Salário: R$ "+f.calcularSalario());

    }
}
