public class EntregaDrone extends Entrega {
    public EntregaDrone(double distanciaKm) { super(distanciaKm); }

    @Override public String getTipo() { return "Drone"; }

    @Override
    public boolean atende() {
        return distanciaKm <= 10;   // so ate 10 km
    }

    @Override
    public String getMotivoRejeicao() { return "drone atende somente ate 10 km"; }

    @Override
    public int calcularPrazo() { return 1; }

    @Override
    public double calcularFrete() { return 3.00 * distanciaKm; }
}
