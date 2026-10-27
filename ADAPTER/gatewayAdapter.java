public class gatewayAdapter implements gatewayNutela{
    //atributo para segurar a classe velha
    gatewayLegado legado;

    //construtor que recebe classe incomnpativel
    public gatewayAdapter(gatewayLegado legado){
        this.legado = legado;
    }

    @Override
    public void procPagamento(double valor){
        this.legado.efetuarPagamento(valor, "BRL");
    }

    @Override
    public boolean validarCartao(String cartao){
        return this.legado.validarCartao(cartao);
    }
}