public class Teste {
    public static void main(String[] args) {
        CriadorMaterial m = new CriadorLivro(600);
        System.out.println(m.processar());

        CriadorRevista r = new CriadorRevista();
        System.out.println(r.processar());

        CriadorDVD d = new CriadorDVD(false);
        System.out.println(d.processar());
    }
}
