public class SobrecargadeMetodos {
    //Sobrecarga ocorre quando vários métodos têm o mesmo nome, mas parâmetros
    //diferentes (em quantidade ou tipo).

    public void exibir(int x) {
        System.out.println("Valor inteiro: " + x);
    }
    public void exibir(String texto) {
        System.out.println("Texto: " + texto);
    }
    public void exibir(int x, String texto) {
        System.out.println(x + " - " + texto);
    }
    public static void main(String[] args) {
        SobrecargadeMetodos sobrecarga = new SobrecargadeMetodos();
        sobrecarga.exibir(10);
        sobrecarga.exibir("Exemplo");
        sobrecarga.exibir(7, "Java");
    }
}
