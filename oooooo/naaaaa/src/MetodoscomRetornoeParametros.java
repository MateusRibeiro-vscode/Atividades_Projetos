public class MetodoscomRetornoeParametros {
    public int multiplicar(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        MetodoscomRetornoeParametros calc = new MetodoscomRetornoeParametros();
        int resultado = calc.multiplicar(4, 5);
        System.out.println("Resultado: " + resultado);
    }
}

