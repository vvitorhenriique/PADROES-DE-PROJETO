public class Main {
    public static void main(String[] args) {
        CentralEntregas central = new CentralEntregas();
        central.registrar("MOTO", new CriadorMoto());
        central.registrar("CAMINHAO", new CriadorCaminhao());
        central.registrar("DRONE", new CriadorDrone());

        System.out.println(">>> Moto 15 km\n" + central.solicitar("MOTO", 15) + "\n");
        System.out.println(">>> Moto 30 km (prazo 4h)\n" + central.solicitar("MOTO", 30) + "\n");
        System.out.println(">>> Caminhao 10 km (frete minimo)\n" + central.solicitar("CAMINHAO", 10) + "\n");
        System.out.println(">>> Caminhao 100 km\n" + central.solicitar("CAMINHAO", 100) + "\n");
        System.out.println(">>> Drone 5 km\n" + central.solicitar("DRONE", 5) + "\n");
        System.out.println(">>> Drone 12 km (rejeitada)\n" + central.solicitar("DRONE", 12) + "\n");

        // tipo inexistente
        System.out.println(">>> Bicicleta (ainda nao registrada)\n" + central.solicitar("BICICLETA", 8) + "\n");

        // EXTENSAO: so classes novas + 1 linha de registro, nenhuma classe existente alterada
        central.registrar("BICICLETA", new CriadorBicicleta());
        System.out.println(">>> Bicicleta 8 km (apos extensao)\n" + central.solicitar("BICICLETA", 8) + "\n");
    }
}
