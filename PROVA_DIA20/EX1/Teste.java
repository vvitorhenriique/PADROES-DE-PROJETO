public class Teste {
    public static void main(String[] args) {
        CriadorFrete c1 = new CriadorTerrestre();
        System.out.println(c1.processar(50.0));

        CriadorFrete c2 = new CriadorAereo();
        System.out.println(c2.processar(100));

        CriadorFrete c3 = new CriadorExpresso();
        System.out.println(c3.processar(150));


    }
}
