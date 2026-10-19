public class CriadorRevista extends CriadorMaterial {
    
    @Override
    public Material criarMaterial() {
        return new Revista();
    }
}
