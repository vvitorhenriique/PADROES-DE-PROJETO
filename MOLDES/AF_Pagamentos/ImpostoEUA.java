public class ImpostoEUA implements Imposto {
    @Override
    public double calcular(double valor) { return valor * 0.08; }
}
