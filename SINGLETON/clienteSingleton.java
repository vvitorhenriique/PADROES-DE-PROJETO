public class clienteSingleton {
    //atributo privado para instanciar
    private static clienteSingleton instancia;
    public String nome;
    public String email;
    //construtor privado

    private clienteSingleton(){

    }

    //metodo para entrega da nistancia
    public static clienteSingleton getInstance(){
        if(instancia == null){
            instancia = new clienteSingleton();
        }
    return instancia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
}