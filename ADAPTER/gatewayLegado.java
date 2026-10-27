//classe incompatível nos dias de hoje

public class gatewayLegado{
    //validar cartão
    public boolean validarCartao(String cartao){
        return cartao != null && cartao.lenght(16);
    }

    //fazer pagamento
    public void efetuarPagamento(double valor, String moeda){
        System.out.println("Pagamento efetuado no valor de: " +valor+ " " +moeda);
    }
}