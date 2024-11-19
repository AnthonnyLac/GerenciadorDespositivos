public class Main {
    public static void main(String[] args) {

        // Obtém a instância única de ConfiguracaoManager
        ConfiguracaoManager configManager = ConfiguracaoManager.getInstance();

        // Exibe as configurações iniciais
        configManager.listarConfiguracoes();

        // Modificando algumas configurações
        configManager.atualizarConfiguracao("nomeApp", "Sistema IoT Avançado");
        configManager.atualizarConfiguracao("versaoApp", "2.0");
        configManager.atualizarConfiguracao("apiEndpoint", "http://api.avancada.com");

        // Adicionando uma nova configuração
        configManager.adicionarConfiguracao("timeout", "30");

        // Exibe as configurações atualizadas
        System.out.println("\nApós modificações:");
        configManager.listarConfiguracoes();

        // Removendo uma configuração
        configManager.removerConfiguracao("timeout");

        // Exibe as configurações após remoção
        System.out.println("\nApós remoção de uma configuração:");
        configManager.listarConfiguracoes();

    }
}