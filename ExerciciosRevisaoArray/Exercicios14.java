import java.util.Scanner;

public class Exercicios14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "";
        String[] perguntas = { "Telefonou para a vítima?",
                "Esteve no local do crime?", "Mora perto da vítima?",
                "Devia para a vítima?", "Já trabalhou com a vítima?" };
        int reu = 0;
        String[] niveis = { "Inocente", "Suspeita", "Cúmplice", "Assassino" };
        for (int i = 0; i < 5; i++) {
            System.out.println(perguntas[i] + " S/N"); // Fix: perguntas[i] instead of perguntas
            resposta = sc.nextLine().toUpperCase();
            if (resposta.equals("S")) {
                reu++;
            } else if (resposta.equals("N")) {

            } else {
                System.out.println("Entrada invalida");
                break;
            }
        }
        System.out.println("O reu é " + niveis[reu]);
    }


}
