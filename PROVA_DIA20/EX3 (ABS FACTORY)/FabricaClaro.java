public class FabricaClaro implements Fabrica {
    
    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaClara();
    }

    @Override
    public Menu criarMenu() {
        return new MenuClaro();
    }
    
}
