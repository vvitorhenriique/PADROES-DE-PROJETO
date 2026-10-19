public class Revista extends Material {
    
    protected int atraso;

    public Revista (int atraso){
        this.atraso = atraso;
    }

    @Override
    public int calcPrazo() {
        int prazo = 7;
        return prazo;
    }

    @Override
    public double calcMulta(int atraso) {
        return atraso * 0.5;
    }

    @Override
    public String gerarResumo() {
        return "Revista | Prazo: " +calcPrazo()+ "dias | Multa total: " +calcMulta(atraso);
    }
}
