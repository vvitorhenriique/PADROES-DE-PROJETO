public class App {
    private Botao botao;
    private Janela janela;
    private Menu menu;

    public App(Fabrica fabrica){
        this.botao = fabrica.criarBotao();
        this.janela = fabrica.criarJanela();
        this.menu = fabrica.criarMenu();
    }

    public void renderizar(){
        botao.renderizar();
        janela.abrir();
        menu.exibir();
    }
}
