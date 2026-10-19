public class DVD extends Material {
    public boolean lancamento; //incialmente é falso
    private int atraso;

    public DVD (boolean lancamento, int atraso){
        this.lancamento = lancamento;
        this.atraso = atraso;
    }

    @Override
    public int calcPrazo() {
        int prazo = 3;
        if(lancamento){
            prazo +=2;
        }
        return prazo;
    }

    @Override
    public double calcMulta(int atraso) {
        return atraso * 3.0;
    }

    @Override
    public String gerarResumo() {
        return "DVD | Prazo: " +calcPrazo()+ "dias | Multa total: R$" +calcMulta(atraso);
    }

}
