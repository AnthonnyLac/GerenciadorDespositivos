import java.util.HashMap;
import java.util.Map;

public class ConfiguracaoManager {

    private static ConfiguracaoManager instance;
    private Map<String, String> configuracoes;


    private ConfiguracaoManager() {
        configuracoes = new HashMap<>();

        // Configurações iniciais (exemplo de configurações padrões)
        configuracoes.put("nomeApp", "Sistema IoT");
        configuracoes.put("versaoApp", "1.0");
        configuracoes.put("apiEndpoint", "http://api.sistema.com");
    }

    public static ConfiguracaoManager getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoManager();
        }
        return instance;
    }

    public String getConfiguracao(String chave) {
        return configuracoes.getOrDefault(chave, "Configuração não encontrada");
    }

    public void atualizarConfiguracao(String chave, String valor) {
        configuracoes.put(chave, valor);
    }

    public void listarConfiguracoes() {
        System.out.println("Configurações Globais:");
        for (Map.Entry<String, String> entry : configuracoes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void adicionarConfiguracao(String chave, String valor) {
        configuracoes.putIfAbsent(chave, valor);
    }

    public void removerConfiguracao(String chave) {
        configuracoes.remove(chave);
    }
}
