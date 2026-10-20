public class CriadorTeatro extends CriadorIngresso {
    private String titular;
    private boolean estudante;
    private boolean lugarMarcado;

    public CriadorTeatro(String titular, boolean estudante, boolean lugarMarcado) {
        this.titular = titular;
        this.estudante = estudante;
        this.lugarMarcado = lugarMarcado;
    }

    @Override
    public Ingresso criarIngresso() {
        return new IngressoTeatro(titular, estudante, lugarMarcado);
    }
}
