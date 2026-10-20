import java.util.HashMap;
import java.util.Map;

// CLIENTE: escolhe o criador pelo tipo usando Map (sem if/switch de tipo)
public class ClienteBilheteria {
    private Map<String, CriadorIngresso> criadores = new HashMap<>();

    public void registrarCriador(String tipo, CriadorIngresso criador) {
        criadores.put(tipo, criador);
    }

    public String solicitarIngresso(String tipo) {
        CriadorIngresso criador = criadores.get(tipo);
        if (criador == null) {   // tratamento de erro, nao decide tipo de produto
            return "ERRO! Tipo de ingresso '" + tipo + "' nao suportado!";
        }
        return criador.processar();
    }
}
