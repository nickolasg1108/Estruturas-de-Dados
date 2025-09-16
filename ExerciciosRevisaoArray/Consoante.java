import java.util.Scanner; 

public class Consoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[10];
        int count = 0;
        int i = 0;

        while (i < 10) {
            System.out.print("Digite uma letra: ");
            String letra = sc.next().toLowerCase();

            // Verifica se é uma letra e se não é vogal
            if (letra.matches("[a-z]") && !"aeiou".contains(letra)) {
                consoantes[count] = letra;
                count++;
            }
            i++;
        }

        System.out.print("Consoantes digitadas: ");
        for (int j = 0; j < count; j++) {
            System.out.print(consoantes[j] + " ");
        }
        System.out.println("\nQuantidade de consoantes: " + count);

        sc.close();
    }
}