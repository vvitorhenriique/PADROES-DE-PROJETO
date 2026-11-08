package EX3;

public class Main {
    public static void main(String[] args) {
        Backup b = new Backup(new ZIP());
        System.out.println(b.calcTamanho(100));

        b.setArquivo(new GZIP());
        System.out.println(b.calcTamanho(100));

        b.setArquivo(new RAR());
        System.out.println(b.calcTamanho(100));

        b.setArquivo(new z());
        System.out.println(b.calcTamanho(100));
        }
}
