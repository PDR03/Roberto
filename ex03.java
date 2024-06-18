import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        int num , n = 0;
        float media;
        int mn, mnrn;
        System.out.println("Digite um numero");
        num = scr.nextInt();
        mn = num;
        mnrn = num;
        n++;
        media = num;
        do{
           
            System.out.println("Digite um numero");
            num = scr.nextInt();
            if(num > mn){
                mn = num;
            }
            if(num < mnrn){
                mnrn = num;
            }
            media += n;
            n++;
        }while(n != 5);

        media = media/ n;
        System.out.println("maior" + mn);
        System.out.println("menor" + mnrn);
        System.out.println("media" + media);

    }
}
