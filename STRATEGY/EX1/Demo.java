package EX1;

public class Demo {
    public static void main(String[] args) {
        Carrinho c = new Carrinho(new Sedex());
        System.out.println(c.calcFrete(100, 50));

        c.setFrete(new PAC());
        System.out.println(c.calcFrete(50, 25));

        c.setFrete(new Retirada());
        System.out.println(c.calcFrete(130, 55));
    }
}
