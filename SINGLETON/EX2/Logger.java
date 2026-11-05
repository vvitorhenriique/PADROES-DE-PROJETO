package EX2;

public class Logger {
    private static Logger instancia;
    public String mensagem;

    private Logger(){
        System.out.println("Criando Logger...");
    }

    public static Logger getInstance(){
        if(instancia == null){
            instancia = new Logger();
        }

        return instancia;
    }

    public void registrar(String mensagem){
        this.mensagem = mensagem;
        System.out.println("[LOG] " +mensagem);
    }
}
