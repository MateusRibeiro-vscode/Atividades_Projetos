import java.time.LocalDate;

// 1) Métodos com Retorno
public class AnoAtual {
    public void ano(){   LocalDate de = LocalDate.now();
    de.getYear();
        System.out.println("" + de);
    }

    static void main(String[] args) {
        AnoAtual a = new AnoAtual();
        a.ano();
    }
}


