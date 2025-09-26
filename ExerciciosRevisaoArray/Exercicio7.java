import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]numero = new int[5];

        int soma = 0;
        int multiplicacao = 1;


        System.out.println("digite 5 numeros inteiros: ");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();

            soma = soma + numero[i];

            multiplicacao = multiplicacao * numero[i];

            
        }
        System.out.println("Os numeros digitados foram: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + ", ");
        }
        System.out.println("A soma dos numeros: " + soma);
        System.out.println("A multiplicacao dos numeros: " + multiplicacao);
        sc.close();
        }
        
    }
