package EX1;

public class Configuracao {
    public static Configuracao instancia;
    public String nome;
    public int ano;
    public String caminho; //caminho do banco

    private Configuracao(){

    }

    public static Configuracao getInstance(){
        if(instancia == null){
            instancia = new Configuracao();
        }

        return instancia;
    }

    public void getNome(String nome){
        this.nome = nome;
    }

    public void getAno(int ano){
        this.ano = ano;
    }

    public void getCaminho(String caminho){
        this.caminho = caminho;
    }

}
