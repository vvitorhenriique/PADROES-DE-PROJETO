// PRODUTO ABSTRATO
public abstract class Entrega {
    protected double distanciaKm;

    public Entrega(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public abstract String getTipo();
    public abstract boolean atende();               // validacao de cobertura
    public abstract String getMotivoRejeicao();
    public abstract int calcularPrazo();            // em horas
    public abstract double calcularFrete();

    // comprovante padronizado (igual para todos os tipos)
    public String gerarComprovante() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- COMPROVANTE DE ENTREGA ---\n");
        sb.append("Tipo: ").append(getTipo()).append("\n");
        sb.append("Distancia: ").append(String.format(java.util.Locale.US, "%.1f", distanciaKm)).append(" km\n");
        sb.append("Prazo: ").append(calcularPrazo()).append(" horas\n");
        sb.append("Frete: R$ ").append(String.format(java.util.Locale.US, "%.2f", calcularFrete()));
        return sb.toString();
    }
}
