public class FabricaEUA implements FabricaRegiao {
    @Override public Pagamento criarPagamento() { return new PagamentoEUA(); }
    @Override public Imposto criarImposto() { return new ImpostoEUA(); }
    @Override public Recibo criarRecibo() { return new ReciboEUA(); }
}
