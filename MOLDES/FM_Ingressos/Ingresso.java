import java.util.List;

// PRODUTO ABSTRATO: declara o que todo ingresso tem. O algoritmo (processar/resumo) fica aqui.
public abstract class Ingresso {
    private static int contador = 0;   // RNF02: numero unico

    protected String titular;
    protected String numero;
    protected double preco;
    protected boolean emitido = false;

    public Ingresso(String titular) {
        this.titular = titular;
    }

    // metodos que cada RF implementa
    public abstract double calcularPreco();
    public abstract boolean validar();
    public abstract List<String> listarDocumentos();
    public abstract String getPrefixo();
    public abstract String getMotivoRejeicao();

    public void processar() {
        if (validar()) {
            this.preco = calcularPreco();
            this.numero = getPrefixo() + String.format("%04d", ++contador);
            this.emitido = true;
        }
    }

    // RNF03: resumo padronizado
    public String resumo() {
        if (!emitido) {
            return "INGRESSO REJEITADO - " + getMotivoRejeicao();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("--- RESUMO INGRESSO ---\n");
        sb.append("Numero: ").append(numero).append("\n");
        sb.append("Titular: ").append(titular).append("\n");
        sb.append("Preco: R$ ").append(String.format("%.2f", preco)).append("\n");
        sb.append("Documentos: ").append(listarDocumentos()).append("\n");
        sb.append("Status: INGRESSO EMITIDO COM SUCESSO");
        return sb.toString();
    }
}
