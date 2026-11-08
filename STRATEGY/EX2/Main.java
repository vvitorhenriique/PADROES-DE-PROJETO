package EX2;

public class Main {
    public static void main(String[] args) {
        Checkout c = new Checkout(new Cartao());
        System.out.println(c.calcTotal(200));
        
        c.setPagamento(new Boleto());
        System.out.println(c.calcTotal(200));

        c.setPagamento(new Pix());
        System.out.println(c.calcTotal(200));
    }
}
