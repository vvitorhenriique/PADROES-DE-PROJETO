public class PagamentoBrasil implements Pagamento {
    @Override
    public void processar() { System.out.println("Pagamento via PIX processado"); }
}
