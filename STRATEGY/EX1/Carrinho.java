package EX1;

public class Carrinho  {
    private Frete frete;

    public Carrinho(Frete frete){
        this.frete = frete;
    }

    public void setFrete(Frete frete){
        this.frete = frete;
    }

    public double calcFrete(double peso, double valor){
        return frete.calcFrete(peso, valor);
    }
}
