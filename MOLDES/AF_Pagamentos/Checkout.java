// CLIENTE: so conhece interfaces; recebe a fabrica no construtor
public class Checkout {
    private Pagamento pagamento;
    private Imposto imposto;
    private Recibo recibo;

    public Checkout(FabricaRegiao fabrica) {
        this.pagamento = fabrica.criarPagamento();
        this.imposto = fabrica.criarImposto();
        this.recibo = fabrica.criarRecibo();
    }

    public void finalizar(double valor) {
        pagamento.processar();
        System.out.println("Imposto: " + String.format(java.util.Locale.US, "%.2f", imposto.calcular(valor)));
        recibo.emitir();
    }
}
