// ABSTRACT FACTORY: um metodo criar para cada produto da familia
public interface FabricaCanal {
    Alerta criarAlerta();
    Som criarSom();
    Icone criarIcone();
}
