public abstract class CriadorMaterial {
    public abstract Material criarMaterial();

    public String processar(){
        Material m = criarMaterial();
        return m.gerarResumo();
    }
}
