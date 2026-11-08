package EX2;

public class Cartao implements Pagamento {

    @Override
    public double calcTotal(double base) {
        double valorFinal = base * 1.05;
        return valorFinal;
    }
}
