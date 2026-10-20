public class CriadorDrone extends CriadorEntrega {
    @Override
    public Entrega criarEntrega(double distanciaKm) { return new EntregaDrone(distanciaKm); }
}
