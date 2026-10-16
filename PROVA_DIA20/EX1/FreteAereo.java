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
    public String gerarRecibo(double peso){
        System.out.print("\n\n");
        return "Frete Aereo | Peso: " +peso+ " kg | Custo R$: " + calcCusto(peso);
    }
}