public class Teste{
    public static void main(String[] args) {
        Inimigo inimigo = new Inimigo("Sans", 1, 5000);
        inimigo.habilidade.add("Canon blast");
        inimigo.habilidade.add("Ossos");

        Inimigo clone1 = inimigo.clonar();
        clone1.habilidade.add("Morte");
        clone1.vida = 3;

        System.out.println("Inimigo: " +inimigo.habilidade+ " Vida: " +inimigo.vida);
        System.out.println("Inimigo: " +clone1.habilidade+ " Vida: " +clone1.vida);
    }
}