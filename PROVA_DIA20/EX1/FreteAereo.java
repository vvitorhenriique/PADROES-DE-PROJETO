public class FreteAereo extends Frete{

    @Override 
    public double calcCusto(double peso){
        double custo = peso * 5;

        if(peso > 50){
            custo *= 1.2;
        }

        return custo;
    }

    @Override 
    public void gerarRecibo(double peso){
        System.out.println("---RESUMO DO PEDIDO---");
        System.out.printf("Peso: %.1f", peso);
        System.out.printf("Tipo de Frete: Aereo");
        System.out.printf("Valor final: R$%.2f", calcCusto(peso));
    }
}