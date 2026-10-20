public class Main {
    public static void main(String[] args) {
        // declarar SEMPRE pela interface
        FabricaCanal mobile = new FabricaMobile();
        CentralNotificacao central = new CentralNotificacao(mobile);

        System.out.println("--- CANAL MOBILE ---");
        central.notificar();

        System.out.println();

        FabricaCanal desktop = new FabricaDesktop();
        System.out.println("--- CANAL DESKTOP ---");
        new CentralNotificacao(desktop).notificar();

        System.out.println();

        // troca de canal sem recriar o cliente
        central.trocarCanal(desktop);
        System.out.println("--- TROCA DE CANAL (mesmo cliente) ---");
        central.notificar();
    }
}
