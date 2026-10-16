public class CriadorExpresso extends CriadorFrete {
    
    @Override
    public Frete criarFrete() {
        return new FreteExpresso();
    }
}
