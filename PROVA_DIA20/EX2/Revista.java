public class Revista extends Material {
    
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
        return "Revista | Prazo: " +calcPrazo()+ "dias | Multa por dia 0,50";
    }
}
