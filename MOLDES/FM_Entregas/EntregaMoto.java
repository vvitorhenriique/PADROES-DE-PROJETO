public class EntregaMoto extends Entrega {
    public EntregaMoto(double distanciaKm) { super(distanciaKm); }

    @Override public String getTipo() { return "Moto"; }
    @Override public boolean atende() { return true; }
    @Override public String getMotivoRejeicao() { return ""; }

    @Override
    public int calcularPrazo() {
        int prazo = 2;
        if (distanciaKm > 20) {
            prazo = 4;
        }
        return prazo;
    }

    @Override
    public double calcularFrete() {
        return 1.20 * distanciaKm;
    }
}
