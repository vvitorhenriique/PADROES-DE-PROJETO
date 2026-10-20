import java.util.HashMap;
import java.util.Map;

// CLIENTE: Map no lugar de if/switch
public class CentralEntregas {
    private Map<String, CriadorEntrega> criadores = new HashMap<>();

    public void registrar(String tipo, CriadorEntrega criador) {
        criadores.put(tipo, criador);
    }

    public String solicitar(String tipo, double distanciaKm) {
        CriadorEntrega criador = criadores.get(tipo);
        if (criador == null) {
            return "ERRO: modalidade '" + tipo + "' não suportada";
        }
        return criador.processar(distanciaKm);
    }
}
