import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];


        int contadorPar = 0;
        int contadorImpar = 0;
        

    System.out.println("Digite os 20 numeros inteiros: ");    
    for (int i = 0; i<numeros.length; i++) {
        System.out.print("Numero " + (i+1) + ": ");
        numeros[i] = sc.nextInt();
    }
    for(int i = 0; i < numeros.length; i++) {
        if (numeros[i] % 2 == 0) {
            par[contadorPar] = numeros[i];
            contadorPar++;
        } else{
            impar[contadorImpar] = numeros[i];
            contadorImpar++;
        }
    }
        System.out.println("\nNumeros impares: ");
          for (int i = 0; i < contadorImpar; i++) {
            System.out.print(impar[i] + ", ");
        }
        System.out.println("\nNumeros pares: ");
          for (int i = 0; i < contadorPar; i++) {
            System.out.print(par[i] + ", ");
      }
      sc.close();
    }
  }




//Faça um programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.