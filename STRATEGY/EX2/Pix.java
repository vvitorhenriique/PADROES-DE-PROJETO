package EX2;

public class Pix implements Pagamento {
    
    @Override
    public double calcTotal(double base) {
        double valorFinal = base * 0.9;
        return valorFinal;
    }
}
