public class FabricaMobile implements FabricaCanal {
    @Override
    public Alerta criarAlerta() { return new AlertaMobile(); }
    @Override
    public Som criarSom() { return new SomMobile(); }
    @Override
    public Icone criarIcone() { return new IconeMobile(); }
}
