import java.util.Stack;

public class ExemploPilha {

    public static void main(String[] args) {

        // 1. Criamos uma pilha que vai guardar caracteres (Character)

        String palavraOriginal = "Arara";
        Stack<Character> pilha = new Stack<>();
        System.out.println("Palavra Original: " + palavraOriginal);

        // 2. Empilhando os Caracteres
        // Pegamos cada letra da palavra e colocamos na pilha
        System.out.print("Acao: Empilhando os caracteres: ");
        for (char letra: palavraOriginal.toCharArray()) {
            pilha.push(letra); // push -> empilhar
            System.out.print("Empilhou: " + letra + " -> Pilha agora: " + pilha);
        }

        // 3. Desempilhando para formar a palavra invertida
        // StringBuilder é mais eficiente para montar strings aos poucos

        StringBuilder palavraInvertida = new StringBuilder();

        System.out.print("\nAcao: Desempilhando para inverter...");
        while (!pilha.isEmpty()) { //Enquanto a pilha NÃO estiver vazia
            char letraDoTopo = pilha.pop(); // pop remove o item do topo e o retorna
            palavraInvertida.append(letraDoTopo);
            System.out.print("Desempilhou: " + letraDoTopo + " -> Pilha invertida agora: " + palavraInvertida);
        }
        System.out.println("\nResultado Final: " + palavraInvertida.toString());

    }
}
