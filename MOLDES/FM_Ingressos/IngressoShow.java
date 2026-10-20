import java.util.ArrayList;
import java.util.List;

// RF01
public class IngressoShow extends Ingresso {
    private boolean pistaPremium;
    private int idade;

    public IngressoShow(String titular, boolean pistaPremium, int idade) {
        super(titular);
        this.pistaPremium = pistaPremium;
        this.idade = idade;
    }

    @Override
    public double calcularPreco() {
        double p = 120.0;
        if (pistaPremium) {
            p = p * 1.30;       // +30%
        }
        return p;
    }

    @Override
    public boolean validar() {
        return idade >= 18;     // menores de 18 nao entram
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>();
        docs.add("RG");
        docs.add("Comprovante de pagamento");
        return docs;
    }

    @Override
    public String getPrefixo() { return "SHW-"; }

    @Override
    public String getMotivoRejeicao() { return "menores de 18 anos nao podem entrar"; }
}
