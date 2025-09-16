import java.util.Scanner;

public class Vetor {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int[]vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero desejado: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Imprimindo os numeros digitados: ");
        for(int i = 0; i < 5; i++ ){
            System.out.print("\nO numero: " + vetor[i]);
        }
        sc.close();
    }
}

