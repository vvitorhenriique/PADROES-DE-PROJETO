public class CriadorLivro extends CriadorMaterial {
    private int paginas;
    private int atraso;

    public CriadorLivro(int paginas, int atraso){
        this.paginas = paginas;
        this.atraso = atraso;
    }

    @Override
    public Material criarMaterial() {
        return new Livro(paginas, atraso);
    }

}
