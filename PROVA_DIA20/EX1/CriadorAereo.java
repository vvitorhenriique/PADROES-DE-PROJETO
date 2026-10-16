public class CriadorAereo extends CriadorFrete {
    
    @Override
    public Frete criarFrete() {
        return new FreteAereo();
    }
}
