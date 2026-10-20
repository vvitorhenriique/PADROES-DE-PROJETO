public class EntregaCaminhao extends Entrega {
    public EntregaCaminhao(double distanciaKm) { super(distanciaKm); }

    @Override public String getTipo() { return "Caminhao"; }
    @Override public boolean atende() { return true; }
    @Override public String getMotivoRejeicao() { return ""; }

    @Override
    public int calcularPrazo() { return 24; }

    @Override
    public double calcularFrete() {
        double frete = 0.80 * distanciaKm;
        if (frete < 50.0) {
            frete = 50.0;           // minimo de R$ 50,00
        }
        return frete;
    }
}
