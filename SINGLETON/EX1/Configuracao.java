package EX1;

public class Configuracao {
    private static Configuracao instancia;
    public String nome;
    public int ano;
    public String caminho; //caminho do banco

    private Configuracao(){
        System.out.println("Lendo arquivo...");
    }

    public static Configuracao getInstance(){
        if(instancia == null){
            instancia = new Configuracao();
        }

        return instancia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setCaminho(String caminho){
        this.caminho = caminho;
    }

}
