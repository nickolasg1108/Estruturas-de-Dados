import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        float[] mesmediatemp = new float[12];
        float mediaAno = 0;
        String[] mesExtenso = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro" };
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite a temperatura média do mês de " + mesExtenso[i]);
            mesmediatemp[i] = sc.nextFloat();
            mediaAno = mediaAno + mesmediatemp[i];
        }
        mediaAno = mediaAno / 12;

        for (int i = 0; i < 12; i++) {
            if (mesmediatemp[i] > mediaAno) {
                System.out.printf(mesExtenso[i] + " teve a temperatura superior a média anual. %n" + mesExtenso[i]
                        + "= " + mesmediatemp[i] + "%nMedia anual= " + mediaAno + "%n");
            }
        }
    }

}