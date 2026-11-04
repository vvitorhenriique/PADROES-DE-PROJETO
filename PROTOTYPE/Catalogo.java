import java.util.*;

public class Catalogo{
    private Map<String, Inimigo> prototipos = new HashMap<>();

    public void registrar(String chave, Inimigo prototipo){
        this.prototipos.put(chave, prototipo.clonar());
    }

    public Inimigo criar(String chave){
        Inimigo proto = this.prototipos.get(chave);
        if(proto == null){ 
            throw new IllegalArgumentException("Inimigo não encontrado: " + chave);
        }
        return proto.clonar();
    }
}