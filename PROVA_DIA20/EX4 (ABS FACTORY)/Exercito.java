public class Exercito {
    private Guerreiro guerreiro;
    private Arqueiro arqueiro;
    private Mago mago;

    public Exercito(FabricaExercito fabrica){
        this.guerreiro = fabrica.criarGuerreiro();
        this.arqueiro = fabrica.criarArqueiro();
        this.mago = fabrica.criarMago();
    }

    public void print(){
        guerreiro.atacar();
        arqueiro.atacar();
        mago.atacar();
    }

}
