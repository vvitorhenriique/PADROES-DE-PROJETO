package EX3;

public class GZIP implements Arquivo {
    
    @Override
    public double calcTamanho(double base) {
        double Final = base * 0.5;
        return Final;
    }
}
