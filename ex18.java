import java.util.Scanner;

public class ex18{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int i = 5;
        int j = 4;
        double notas[][] = new double[i][j];
        double bm[] = new double[j];
        double nanual[] = new double[i];
        leitorMatriz(notas, i, j);
        for(int l = 0; l < j; l++){
            for(int c = 0; c < i; c++){
                bm[l] = notas[i][j];
            }
        }
        for(int n = 0; n < i; n++){
            for(int m = 0; m < j; m++){
                nanual[n] += notas[i][j];
            }
        }
        for(int u = 0; u < j; u++ ){
            System.out.println((bm[u] / j));
        }
        for(int u = 0; u < i; u++ ){
            System.out.println((nanual[u] / i));
        }

    }
    public static void leitorMatriz(double matriz[][], int condicao, int condicao1){
        Scanner scr = new Scanner(System.in);
        for(int i = 0; i < condicao; i++){
            System.out.println("aluno " + i);
            for(int j = 0; j < condicao1; j++){
                matriz[i][j] = scr.nextDouble();
            }
        }
    }
}