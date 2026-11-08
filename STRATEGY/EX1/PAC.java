package EX1;

public class PAC implements Frete {
    
    @Override
    public double calcFrete(double peso, double valor) {
        Double frete = peso * 5;
        return frete;
    }
}
