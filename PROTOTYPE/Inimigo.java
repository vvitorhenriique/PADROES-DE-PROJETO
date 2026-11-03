
import java.util.*;

public class Inimigo implements Prototipo <Inimigo>{
    public String nome;
    public int vida;
    public int velocidade;
    public List<String> habilidade = new ArrayList<>();

    public Inimigo(String nome, int vida, int velocidade){
        this.nome = nome;
        this.vida = vida;
        this.velocidade = velocidade;
    }

    @Override
    public Inimigo clonar(){
        Inimigo copia = new Inimigo(this.nome, this.vida, this.velocidade);
        for(String h : this.habilidade){
            copia.habilidade.add(h);
        }
        return copia;
    }


}