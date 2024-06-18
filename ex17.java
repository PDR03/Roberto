import java.util.Scanner;

public class ex17{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n,max,min,pos = 1,pos1 = 1,qnt = 1,media;
        System.out.println("Digite um numero");
        n = scr.nextInt();
        max = n;
        min = n;
        media = n;
        while(n != 0){
        System.out.println("DIgite um numero(0 para encerrar)");
        n = scr.nextInt();
        if(n > max){
            max = n;
            pos = qnt;
        }
        if(n < min && n != 0){
            min = n;
            pos1 = qnt;
        }
        media += n;
        qnt++;
        }
        media = media/qnt;
        System.out.println(max + " na posição " + pos);
        System.out.println(min + " na posição " + pos1 );
        System.out.println("A média é " + media);
    }  
}