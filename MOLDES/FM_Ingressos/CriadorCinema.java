public class CriadorCinema extends CriadorIngresso {
    private String titular;
    private boolean tresD;

    public CriadorCinema(String titular, boolean tresD) {
        this.titular = titular;
        this.tresD = tresD;
    }

    @Override
    public Ingresso criarIngresso() {
        return new IngressoCinema(titular, tresD);
    }
}
