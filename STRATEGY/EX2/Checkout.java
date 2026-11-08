package EX2;

public class Checkout {
    private Pagamento pagamento;

    public Checkout(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public void setPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public double calcTotal(double base){
        return pagamento.calcTotal(base);
    }
}
