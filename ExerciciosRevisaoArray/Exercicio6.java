import java.util.Scanner;

public class Exercicio6 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);



        int[][]notas = new int[10][4];
        String[]alunos = new String[10];
        double[]media = new double[10];

        for (int i = 0; i < alunos.length; i++) {

        System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
        alunos[i] = sc.nextLine();
        
        int somaDasNotas = 0;

        System.out.println("Digite as 4 notas de: " + alunos[i] + ": ");
        for (int j = 0; j < 4; j++) {
            System.out.print("Nota " + (j + 1) + ": ");
            notas[i][j] = sc.nextInt();

            somaDasNotas = somaDasNotas + notas[i][j];
        }
         
        media[i] = somaDasNotas / 4.0;

        sc.nextLine(); 
    }
        for (int i = 0; i < alunos.length; i++) {
            if (media[i] >= 7) {
                System.out.println("Aluno " + alunos[i] + " aprovado com media: " + media[i]);
            } else {
                System.out.println("Aluno " + alunos[i] + " reprovado com media: " + media[i]);
            }

            
    }
    sc.close();
}
}



// Faça um programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.