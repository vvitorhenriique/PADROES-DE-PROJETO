public class CriadorDVD extends CriadorMaterial {
    private boolean lancamento;
    private int atraso;

    public CriadorDVD(boolean lancamento, int atraso){
        this.lancamento = lancamento;
        this.atraso = atraso;
    }

    @Override
    public Material criarMaterial() {
        return new DVD(lancamento, atraso);
    }
}
