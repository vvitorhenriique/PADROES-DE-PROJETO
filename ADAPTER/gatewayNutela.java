//nova interface esperada
//transformar gateway legado nesta aqui

public interface gatewayNutela{
    void procPagamento(double valor);
    boolean validarCartao(String cartao);
}
