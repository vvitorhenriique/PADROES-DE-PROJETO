public class FabricaDesktop implements FabricaCanal {
    @Override
    public Alerta criarAlerta() { return new AlertaDesktop(); }
    @Override
    public Som criarSom() { return new SomDesktop(); }
    @Override
    public Icone criarIcone() { return new IconeDesktop(); }
}
