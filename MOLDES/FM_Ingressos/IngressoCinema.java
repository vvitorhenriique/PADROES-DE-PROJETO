import java.util.ArrayList;
import java.util.List;

// RF03
public class IngressoCinema extends Ingresso {
    private boolean tresD;

    public IngressoCinema(String titular, boolean tresD) {
        super(titular);
        this.tresD = tresD;
    }

    @Override
    public double calcularPreco() {
        double p = 30.0;
        if (tresD) {
            p = p + 10.0;       // +R$ 10 para 3D
        }
        return p;
    }

    @Override
    public boolean validar() {
        return true;            // sem restricao
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>();
        docs.add("RG");
        return docs;
    }

    @Override
    public String getPrefixo() { return "CIN-"; }

    @Override
    public String getMotivoRejeicao() { return ""; }
}
