import java.util.ArrayList;
import java.util.List;

// RF02
public class IngressoTeatro extends Ingresso {
    private boolean estudante;
    private boolean lugarMarcado;

    public IngressoTeatro(String titular, boolean estudante, boolean lugarMarcado) {
        super(titular);
        this.estudante = estudante;
        this.lugarMarcado = lugarMarcado;
    }

    @Override
    public double calcularPreco() {
        double p = 80.0;
        if (estudante) {
            p = p * 0.50;       // estudante paga 50%
        }
        return p;
    }

    @Override
    public boolean validar() {
        return lugarMarcado;    // exige lugar marcado
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>();
        docs.add("RG");
        if (estudante) {
            docs.add("Carteirinha de estudante");
        }
        return docs;
    }

    @Override
    public String getPrefixo() { return "TEA-"; }

    @Override
    public String getMotivoRejeicao() { return "emissao exige lugar marcado"; }
}
