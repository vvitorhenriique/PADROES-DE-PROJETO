package EX3;

public class RAR implements Arquivo {
    
    @Override
    public double calcTamanho(double base) {
        double Final = base * 0.4;
        return Final;
    }
}
