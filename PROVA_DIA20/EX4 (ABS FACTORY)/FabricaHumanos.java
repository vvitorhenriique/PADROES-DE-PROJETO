public class FabricaHumanos implements FabricaExercito {
    
    @Override
    public Guerreiro criarGuerreiro() {
        return new GuerreiroHumano();
    }

    @Override
    public Arqueiro criarArqueiro() {
        return new ArqueiroHumano();
    }

    @Override
    public Mago criarMago() {
        return new MagoHumano();
    }
}
