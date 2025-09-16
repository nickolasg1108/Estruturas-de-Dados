import java.util.Scanner;

public class Vetor2 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int[]vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o numero desejado: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Imprimindo os numeros digitados na ordem inversa: ");
        for(int i = 9; i > 0; i-- ){
            System.out.print("\nO numero: " + vetor[i]);
        }
        sc.close();
    }
}

