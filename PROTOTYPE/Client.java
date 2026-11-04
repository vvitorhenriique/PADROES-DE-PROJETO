import java.util.*;

public class Client {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Inimigo orcProto = new Inimigo("Orc", 10, 5);
        Inimigo esqueletoProto = new Inimigo("Esqueleto", 5, 10);
        Inimigo dragaoProto = new Inimigo("Dragao", 10, 10);

        orcProto.habilidade.add("Mordida");
        esqueletoProto.habilidade.add("Flechas");
        dragaoProto.habilidade.add("Cuspir fogo");

        List<Inimigo> exercito = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            if(i%3 == 0){
                Inimigo novo = catalogo.criar("orc");
                novo.x = i++;
                novo.y = i;
                exercito.add(novo);
            } if(i % 3 == 1){
                Inimigo novo = catalogo.criar("esqueleto");
                novo.x = 100+(i+1);
                novo.y = 100+i;
                exercito.add(novo);
            } if(i % 3 == 2){
                Inimigo novo = catalogo.criar("dragao");
                novo.x = 200 + (i+1);
                novo.y = 200 + i;
                exercito.add(novo);
            }

        }

        Inimigo teste1 = exercito.get(34);
        teste1.vida = 3;
        teste1.habilidade.add("RETURN BY DEATH");

        System.out.println("--- PROTOTIPOS ---");
        System.out.println("Nome: " +orcProto.nome+ "Vida: " +orcProto.vida+ "Velocidade: " +orcProto.velocidade);
        System.out.println("Nome: " +esqueletoProto.nome+ "Vida: " +esqueletoProto.vida+ "Velocidade: " +esqueletoProto.velocidade);
        System.out.println("Nome: " +dragaoProto.nome+ "Vida: " +dragaoProto.vida+ "Velocidade: " +dragaoProto.velocidade);

        System.out.println("--- TESTES ---");
        System.out.println("Nome: " +teste1.nome+ "Vida: " +teste1.vida+ "Velocidade: " +teste1.velocidade);
    }
    
}
