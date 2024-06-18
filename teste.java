import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = 10;
        int vetor[] = new int[n];

        for(int i = 0; i < n; i++){
            vetor[i] = scr.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(vetor[i] % 2 == 0){
            vetor[i] = 0;
            }else{
                vetor[i] = 1;
            }
        } 
        
        for(int i = 0; i < n; i++){
            System.out.println(vetor[i]);
        }
    }
}