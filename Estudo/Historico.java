import java.util.Stack;

public class Historico {

    public static void main(String[] args) {
    Stack<String> historico = new Stack<>();
    
     System.out.println(">>> Iniciando o simulador de navegador <<<");

    historico.push("www.google.com");
    historico.push("www.youtube.com");
    historico.push("www.github.com");
    historico.push("www.uol.com.br");

    System.out.println("\nSites visitados. Historico atual: " + historico);

    System.out.println("Simulando o clique no botao 'Voltar'...");

    while (!historico.isEmpty()) {
        String siteAtual = historico.pop();
        System.out.println("Voltando do site: " + siteAtual);
        if (!historico.isEmpty()) {
            System.out.println("Agora voce esta em: " + historico.peek());
        } else {
            System.out.println("Voce esta na pagina inicial. Não ha mais historico.");
        }
    }
    System.out.println("Historico de navegacao vazio!");
    }
}