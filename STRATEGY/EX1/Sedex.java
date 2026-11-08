package EX1;

public class Sedex implements Frete {
    
    @Override
    public double calcFrete(double peso, double valor) {
        double frete = (peso * 10) + (valor * 0.05);    
        return frete;
    }
}
