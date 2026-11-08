package EX3;

public class Backup {
    private Arquivo arquivo;

    public Backup(Arquivo arquivo){
        this.arquivo = arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public double calcTamanho(double base){
        return arquivo.calcTamanho(base);
    }
    
}
