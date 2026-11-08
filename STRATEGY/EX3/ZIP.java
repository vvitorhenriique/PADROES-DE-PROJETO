package EX3;

public class ZIP implements Arquivo {
    
    @Override
    public double calcTamanho(double base) {
        double Final = base * 0.6;
        return Final;
    }
}
