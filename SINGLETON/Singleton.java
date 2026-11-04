public class Singleton{
    public static void main(String[] args) {
        clienteSingleton a = clienteSingleton.getInstance();
        clienteSingleton b = clienteSingleton.getInstance();

        a.setNome("Evandro");
        b.setNome("Ronaldo");

        System.out.println(b.nome);
        System.out.println(a == b);

    }
}