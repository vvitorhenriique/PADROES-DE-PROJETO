public class FabricaBrasil implements FabricaRegiao {
    @Override public Pagamento criarPagamento() { return new PagamentoBrasil(); }
    @Override public Imposto criarImposto() { return new ImpostoBrasil(); }
    @Override public Recibo criarRecibo() { return new ReciboBrasil(); }
}
