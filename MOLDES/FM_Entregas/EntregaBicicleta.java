public class EntregaBicicleta extends Entrega {
    public EntregaBicicleta(double distanciaKm) { super(distanciaKm); }

    @Override public String getTipo() { return "Bicicleta"; }
    @Override public boolean atende() { return distanciaKm <= 15; }
    @Override public String getMotivoRejeicao() { return "bicicleta atende somente ate 15 km"; }
    @Override public int calcularPrazo() { return 6; }
    @Override public double calcularFrete() { return 0.50 * distanciaKm; }
}
