public class Livro extends Material {
    
    protected String nome; //nome do livro
    protected int paginas; //quyantidade de paginas qut etm o livro
    protected int atraso; //dias que estão atrasados

    public Livro(int paginas, int atraso){
        this.paginas = paginas;
        this.atraso = atraso;

    }

    @Override
    public int calcPrazo() {
        int prazo = 14; //dias que o livro foi emprestado;
        if(paginas > 500){
            prazo +=7;
        }
        return prazo;
    }

    @Override
    public double calcMulta(int atraso) {
       return atraso * 1.5;
    }

    @Override
    public String gerarResumo() {
        return "Livro | Prazo: " +calcPrazo() + "dias | Multa total: R$" +calcMulta(atraso);
    }
}
