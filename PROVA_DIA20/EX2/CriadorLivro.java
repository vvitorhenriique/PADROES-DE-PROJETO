public class CriadorLivro extends CriadorMaterial {
    private int paginas;

    public CriadorLivro(int paginas){
        this.paginas = paginas;
    }

    @Override
    public Material criarMaterial() {
        return new Livro(paginas);
    }

}
