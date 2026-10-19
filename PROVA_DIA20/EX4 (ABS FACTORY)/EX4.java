public class EX4 {
    public static void main(String[] args) {
        FabricaExercito humanos = new FabricaHumanos();
        Exercito h1 = new Exercito(humanos);

        System.out.println("--- HUMANOS ---");
        h1.print();


        FabricaExercito Orc = new FabricaOrc();
        Exercito o1 = new Exercito(Orc);

        System.out.println("--- ORCS ---");
        o1.print();
    }
}
