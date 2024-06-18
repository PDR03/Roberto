import java.util.Scanner;

public class ex19 {
   public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    int i = 2;
    int j = 5;
    int vetor[] = new int[j];
    int vetor1[] = new int[j];
    int matriz[][] = new int[i][j];
    lerVetor(vetor, j);
    lerVetor(vetor1, j);
    receptorMatriz(matriz, vetor, vetor1, i, j);
    for(int n = 0; n < i; n++){
        for(int m = 0; m < j; m++){
            System.out.println(matriz[i][j]);
        }
    }
   } 
   public static  void lerVetor(int vetor[], int cond){
    Scanner scr = new Scanner(System.in);
    for(int j = 0; j < cond; j++){
        vetor[j] = scr.nextInt();
    }
   }
   public static void receptorMatriz(int matriz[][],int vetor[],int vetor1[], int cond,int cond1){
    Scanner scr = new Scanner(System.in);
    for(int i = 0; i < cond; i++){
        for(int j = 0; j < cond1; j++){
            if(j % 2 == 0){ 
                matriz[i][j] = vetor[j];
            }else{
                matriz[i][j] = vetor1[j];
            }
        } 
    }
   }
}
