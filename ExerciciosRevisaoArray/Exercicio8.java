import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        String[]pessoa = new String[5];
        int[]idade = new int[5];
        float[]altura = new float[5];


        
        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Digite o nome das 5 pessoas: " + (i + 1) + ": ");
            pessoa[i] = sc.nextLine();

            System.out.println("Digite a idade de " + pessoa[i] + ": ");
            idade[i] = sc.nextInt();

            System.out.println("Digite a altura de " + pessoa[i] + ": ");
            altura[i] = sc.nextFloat();

            sc.nextLine();
        }
        for(int i = 0; i < pessoa.length; i++) {    
        System.out.println("A altura de: " + pessoa[i] + " e: " + altura[i] + " e a idade e: " + idade[i]);
    }
    sc.close();
    }
}