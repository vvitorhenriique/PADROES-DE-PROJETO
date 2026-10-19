public class EX3 {
    public static void main(String[] args) {
        Fabrica claro = new FabricaClaro();
        App p1 = new App(claro);

        System.out.println("---TEMA CLARO ---");
        p1.renderizar();


        FabricaEscura escuro = new FabricaEscura();
        App p2 = new App(escuro);

        System.out.println("---TEMA ESCURO ---");
        p2.renderizar();
    }
}
