// CRIADOR ABSTRATO: metodo fabrica abstrato + processamento concreto e FINAL
public abstract class CriadorIngresso {

    public abstract Ingresso criarIngresso();   // FACTORY METHOD

    public final String processar() {
        Ingresso ingresso = criarIngresso();    // so conhece a abstracao
        ingresso.processar();
        return ingresso.resumo();
    }
}
