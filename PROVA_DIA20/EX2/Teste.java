public class Teste {
    public static void main(String[] args) {
        CriadorMaterial m = new CriadorLivro(600, 4);
        System.out.println(m.processar());

        CriadorRevista r = new CriadorRevista(0);
        System.out.println(r.processar());

        CriadorDVD d = new CriadorDVD(false,2);
        System.out.println(d.processar());
    }
}
