public class CriadorShow extends CriadorIngresso {
    private String titular;
    private boolean pistaPremium;
    private int idade;

    public CriadorShow(String titular, boolean pistaPremium, int idade) {
        this.titular = titular;
        this.pistaPremium = pistaPremium;
        this.idade = idade;
    }

    @Override
    public Ingresso criarIngresso() {
        return new IngressoShow(titular, pistaPremium, idade);
    }
}
