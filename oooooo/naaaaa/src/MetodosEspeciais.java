public class MetodosEspeciais {
   //Métodos static pertencem diretamente à classe e não exigem instância para seremchamados.
   public static void mensagemEstatica() {
       System.out.println("Método estático chamado!");
   }
    public static void main(String[] args) {
        MetodosEspeciais.mensagemEstatica();
    }
}

