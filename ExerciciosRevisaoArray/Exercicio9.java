import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] VetorA = new double[10];
        double resultado = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor");
            VetorA[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            resultado = resultado + Math.pow(VetorA[i], 2);
        }
        System.out.println("A soma dos quadrados dos elementos do vetor é: " + resultado);
    }

}