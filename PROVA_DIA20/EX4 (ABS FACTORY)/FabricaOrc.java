public class FabricaOrc implements FabricaExercito {
    
    @Override
    public Guerreiro criarGuerreiro() {
        return new GuerreiroOrc();
    }

    @Override
    public Arqueiro criarArqueiro() {
        return new ArqueiroOrc();
    }

    @Override
    public Mago criarMago() {
        return new MagoOrc();
    }
}
