// CLIENTE: so conhece interfaces. Recebe a fabrica no construtor
// e pode trocar de canal depois (variacao comum de prova).
public class CentralNotificacao {
    private Alerta alerta;
    private Som som;
    private Icone icone;

    public CentralNotificacao(FabricaCanal fabrica) {
        montar(fabrica);
    }

    public void trocarCanal(FabricaCanal fabrica) {
        montar(fabrica);
    }

    private void montar(FabricaCanal fabrica) {
        this.alerta = fabrica.criarAlerta();
        this.som = fabrica.criarSom();
        this.icone = fabrica.criarIcone();
    }

    public void notificar() {
        alerta.exibir();
        som.tocar();
        icone.mostrar();
    }
}
