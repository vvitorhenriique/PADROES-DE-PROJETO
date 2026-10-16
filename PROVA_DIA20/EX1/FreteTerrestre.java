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
    public String gerarRecibo(double peso){
        System.out.print("\n\n");
        return "Frete Terrestre | Peso: " +peso+ " kg | Custo R$: " + calcCusto(peso);
    }
}
