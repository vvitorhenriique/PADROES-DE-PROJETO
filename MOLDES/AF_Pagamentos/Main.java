public class Main {
    public static void main(String[] args) {
        FabricaRegiao brasil = new FabricaBrasil();
        System.out.println("--- BRASIL (R$ 200,00) ---");
        new Checkout(brasil).finalizar(200.0);

        System.out.println();

        FabricaRegiao eua = new FabricaEUA();
        System.out.println("--- EUA (US$ 200.00) ---");
        new Checkout(eua).finalizar(200.0);
    }
}
