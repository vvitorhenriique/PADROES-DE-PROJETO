public class CriadorDVD extends CriadorMaterial {
    private boolean lancamento;

    public CriadorDVD(boolean lancamento){
        this.lancamento = lancamento;
    }

    @Override
    public Material criarMaterial() {
        return new DVD(lancamento);
    }
}
