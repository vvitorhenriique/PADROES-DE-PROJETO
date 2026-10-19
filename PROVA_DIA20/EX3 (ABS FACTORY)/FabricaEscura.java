public class FabricaEscura implements Fabrica{

    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaEscura();
    }

    @Override
    public Menu criarMenu() {
        return new MenuEscuro();
    }
}