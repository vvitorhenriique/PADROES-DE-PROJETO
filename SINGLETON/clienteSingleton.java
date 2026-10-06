public class clienteSingleton {
    //atributo privado para instanciar
    private clienteSingleton instancia;
    public String nome;
    public String email;
    //construtor privado

    
    private clienteSingleton(){

        this.instancia = new clienteSingleton();
    }

    //metodo para entrega da nistancia
    public clienteSingleton getInstance(){
        if(this.instancia == null){
            new clienteSingleton();
        }
    } return this.instancia;
}