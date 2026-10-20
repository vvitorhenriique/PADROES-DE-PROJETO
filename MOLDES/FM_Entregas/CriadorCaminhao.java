public class CriadorCaminhao extends CriadorEntrega {
    @Override
    public Entrega criarEntrega(double distanciaKm) { return new EntregaCaminhao(distanciaKm); }
}
