public class Teste{
    public static void main(String[] args){
        //construir processador (interface) do gateway nutela
        gatewayNutela processador = new gatewayAdapter(new gatewayLegado);
    }

    processador.validarCartao("1234567");
    processador.validarCartao("12345678901234567");
    processador.efetuarPagamento(3000);
}