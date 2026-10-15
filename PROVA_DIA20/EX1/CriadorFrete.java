public abstract class CriadorFrete {

    public abstract Frete criarFrete();

    public String processar(double peso){
        Frete f = criarFrete();
        return f.gerarRecibo(peso);
    }


}
