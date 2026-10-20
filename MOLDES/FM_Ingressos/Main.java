public class Main {
    public static void main(String[] args) {
        ClienteBilheteria cliente = new ClienteBilheteria();

        // um criador por pedido (cada criador guarda os dados do seu ingresso)
        cliente.registrarCriador("SHOW", new CriadorShow("Ana Lima", true, 25));
        cliente.registrarCriador("TEATRO", new CriadorTeatro("Bruno Reis", true, true));
        cliente.registrarCriador("CINEMA", new CriadorCinema("Carla Dias", true));

        // casos rejeitados
        cliente.registrarCriador("SHOW-MENOR", new CriadorShow("Davi Melo", false, 16));
        cliente.registrarCriador("TEATRO-SEM-LUGAR", new CriadorTeatro("Eva Souza", false, false));

        String[] pedidos = {"SHOW", "TEATRO", "CINEMA", "SHOW-MENOR", "TEATRO-SEM-LUGAR", "OPERA"};
        for (String tipo : pedidos) {
            System.out.println(">>> Pedido: " + tipo);
            System.out.println(cliente.solicitarIngresso(tipo));
            System.out.println();
        }
    }
}
