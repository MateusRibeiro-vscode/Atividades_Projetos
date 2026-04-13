public class Destrutores {
    //Java não possui destrutores explícitos, mas existe o método especial finalize()
    //(raramente utilizado).
    protected void finaliza() {
        System.out.println("Objeto está sendo removido pelo Garbage Collector");
    }
    public static void main(String[] args) {
        Destrutores exemplo = new Destrutores();
        exemplo = null; // torna objeto disponível para remoção
        System.gc(); // sugere execução do Garbage Collector
    }
}

