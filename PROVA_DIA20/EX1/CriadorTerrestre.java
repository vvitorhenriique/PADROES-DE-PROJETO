public class CriadorTerrestre extends CriadorFrete {


    @Override
    public Frete criarFrete() {
        return new FreteTerrestre();
    }
    
}
