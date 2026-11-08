package EX2;

public class Boleto implements Pagamento {
    
    @Override
    public double calcTotal(double base) {
        return base;
    }
}
