public class FreteExpresso extends Frete{
    

    @Override 
    public double calcCusto(double peso){
        double custo = peso * 8;
        return custo;
    }

    @Override 
    public String gerarRecibo(double peso){
        System.out.print("\n\n");
        return "Frete Expresso | Peso: " +peso+ " kg | Custo R$: " + calcCusto(peso);
    }
}
