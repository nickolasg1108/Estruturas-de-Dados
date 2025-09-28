import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        int somavalores = 0;
        int acimamedia = 0;
        int abaixosete = 0;

        while (true) {
            System.out.println("Forneça um valor, forneça -1 para finalizar o programa");
            int checagem = sc.nextInt();
            if (checagem == -1) {
                break;
            }
            valores.add(checagem);
        }

        System.out.println("Foram digitados " + valores.size() + " no total");

        System.out.println("Valores informados: ");
        for (int v : valores) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.printf("%nValores informados em ordem inversa: %n");
        for (int i = valores.size() - 1; i >= 0; i--) {
            System.out.println(valores.get(i));
        }

        
        for (int v : valores) {
            somavalores += v;
        }
        System.out.println("A soma dos valores é: " + somavalores);

        
        float mediavalores = valores.size() > 0 ? (float) somavalores / valores.size() : 0;
        System.out.println("A média dos valores é: " + mediavalores);

        
        for (int v : valores) {
            if (v > mediavalores) {
                acimamedia++;
            }
        }
        System.out.println("O total de valores acima da média é " + acimamedia);

        
        for (int v : valores) {
            if (v < 7) {
                abaixosete++;
            }
        }
        System.out.println("O total de valores abaixo de sete é " + abaixosete);

        
        System.out.println("Questão dos inferno\nAdeus, encerrando programa");

    }

}
