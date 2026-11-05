package EX3;

public class ConexaoBD {
    private static ConexaoBD instancia;
    public String url = "Sem URL";
    public String usuario;
    public boolean conectada = false;

    private ConexaoBD(){
    }

    public static ConexaoBD getInstance(){
        if(instancia == null){
            instancia = new ConexaoBD();
        }
        return instancia;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public void conectar(){
        if(url == "Sem URL"){
            System.out.println("ERRO! Sem URL! Faça SetUrl para selecionar uma!");
            return;
        } else{
            conectada = true;
            System.out.println("Conectado a: " +url);
        }
    }
}

