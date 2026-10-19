public class DVD extends Material {
    public boolean lancamento; //incialmente é falso

    public DVD (boolean lancamento){
        this.lancamento = lancamento;
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
        return "DVD | Prazo: " +calcPrazo()+ "dias | Multa por dia R$3,00";
    }

}
