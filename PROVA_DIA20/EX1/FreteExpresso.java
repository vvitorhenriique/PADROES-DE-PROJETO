public class FreteExpresso extends Frete{
    

    @Override 
    public double calcCusto(double peso){
        double custo = peso * 8;
        return custo;
    }

    @Override 
    public void gerarRecibo(double peso){
        System.out.println("---RESUMO DO PEDIDO---");
        System.out.printf("Peso: %.1f", peso);
        System.out.printf("Tipo de Frete: Expresso");
        System.out.printf("Valor final: R$%.2f", calcCusto(peso));
    }
}
