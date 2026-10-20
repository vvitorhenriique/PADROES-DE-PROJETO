public class ImpostoBrasil implements Imposto {
    @Override
    public double calcular(double valor) { return valor * 0.15; }
}
