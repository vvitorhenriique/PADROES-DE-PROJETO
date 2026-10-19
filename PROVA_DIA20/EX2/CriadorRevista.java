public class CriadorRevista extends CriadorMaterial {
    private int atraso;

    public CriadorRevista(int atraso){
        this.atraso = atraso;
    }

    @Override
    public Material criarMaterial() {
        return new Revista(atraso);
    }
}
