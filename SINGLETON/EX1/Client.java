package EX1;

public class Client {
    public static void main(String[] args) {
        Configuracao configuracao = Configuracao.getInstance();
        Configuracao configuracao2 = Configuracao.getInstance();

        configuracao.setAno(2017);
        configuracao.setNome("UP");

        System.out.printf("Nome: %s, Ano: %d%n", configuracao2.nome, configuracao2.ano);


    }
}
