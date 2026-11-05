package EX2;

public class Teste {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.registrar("Ola!");
        System.out.println("Mensagem do LOG: " +log2.mensagem);

        log2.registrar("testando!!!!");
        System.out.println("Mensagem do LOG: " +log1.mensagem);

        System.out.println(log1 == log2);

        System.out.println("Impresso (Criando logger...) 1 vez somente!");
    }
}
