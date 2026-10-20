public class CriadorMoto extends CriadorEntrega {
    @Override
    public Entrega criarEntrega(double distanciaKm) { return new EntregaMoto(distanciaKm); }
}
