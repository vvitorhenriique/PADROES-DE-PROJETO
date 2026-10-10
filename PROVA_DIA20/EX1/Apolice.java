import java.util.ArrayList;
import java.util.List;

public abstract class Apolice {
    private int numero; //numero da apolice
    private String segurado; //nome
    private String data; //data de emissão
    private double premio;//valor do premio
    private List <String> documentos; //lista de documentos exigidos
    private boolean contratado; //0 para não, 1 para sim;
    private String mensagem; //para a função print

    public Apolice(String segurado){
        this.numero = 1; //teste
        //this.numero = (int)(Math.random() *100 + 1); //numero aleatorio
        this.segurado = segurado;
        this.data = "18/10/2006";
        this.documentos = new ArrayList<>();
        this.contratado = false; //ainda não foi testado
        this.mensagem = "Ainda nada";
    }
 
    //metodos para override depois
    public abstract double calcPremio();
    public abstract boolean calcContratado();
    public abstract String listDocumentos();

    public void processar(){
        this.premio = calcPremio();
        this.contratado = calcContratado();

        if(!calcContratado()){
            this.mensagem = "Contratação RECUSADA!";
        }
    }

    public String print(){

        if(!contratado){
            return "APOLICE REJEITADA" + mensagem;
        }
        System.out.println("---RESUMO APOLICE---");
        System.out.printf("Numero: %i\n", numero);
        System.out.printf("Nome do Segurado: %s\n", segurado);
        System.out.printf("Data: %s\n", data);
        System.out.printf("Valor do premio: %.2f\n", premio);
        System.out.printf("Documentos exigidos: ");
        for (String i : documentos){
            System.out.printf("%s ", i);
        }

        return mensagem = "Apolice ativada!";
    }




}