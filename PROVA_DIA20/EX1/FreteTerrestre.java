public class FreteTerrestre extends Frete{
    
    @Override 
    public double calcCusto(double peso){
        double custo = peso * 2;

        if(peso > 100){
            custo = custo * 1.1;
        }
        return custo;
    }

    @Override 
    public void gerarRecibo(double peso){
        System.out.println("---RESUMO DO PEDIDO---");
        System.out.printf("Peso: %1.f", peso);
        System.out.printf("Tipo de Frete: Terrestre");
        System.out.printf("Valor final: R$%.2f", calcCusto(peso));
    }
}
