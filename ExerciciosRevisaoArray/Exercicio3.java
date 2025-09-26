import java.util.Scanner; 

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[4];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero desejado: ");
            numeros[i] = sc.nextInt();
        }

        for (int num : numeros) {
            soma += num;
        }

        double media = soma / numeros.length;
        System.out.println("A média é: " + media);

        sc.close();
    }
} 


