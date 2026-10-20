// ABSTRACT FACTORY
public interface FabricaRegiao {
    Pagamento criarPagamento();
    Imposto criarImposto();
    Recibo criarRecibo();
}
