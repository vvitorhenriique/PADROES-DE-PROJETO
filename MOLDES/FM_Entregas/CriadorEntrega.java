// CRIADOR ABSTRATO
// Variacao: o metodo fabrica RECEBE um parametro (distancia). Os criadores concretos
// ficam sem atributos e podem ser reutilizados para varios pedidos.
public abstract class CriadorEntrega {

    public abstract Entrega criarEntrega(double distanciaKm);   // FACTORY METHOD

    public final String processar(double distanciaKm) {
        Entrega entrega = criarEntrega(distanciaKm);
        if (!entrega.atende()) {
            return "ENTREGA REJEITADA - " + entrega.getMotivoRejeicao();
        }
        return entrega.gerarComprovante();
    }
}
