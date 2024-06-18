import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n1,n2;
        n1 = scr.nextInt();
        n2 = scr.nextInt();
        while(n1 > n2){
            System.out.println("n1 ainda é maior ");
            n1 = scr.nextInt();
        }
        while(n1 < n2){
            System.out.println(n1);
            n1++;
        }
    }    
}
