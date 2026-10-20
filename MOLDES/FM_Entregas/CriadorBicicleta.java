public class CriadorBicicleta extends CriadorEntrega {
    @Override
    public Entrega criarEntrega(double distanciaKm) { return new EntregaBicicleta(distanciaKm); }
}
