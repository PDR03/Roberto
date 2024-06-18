import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n, m;
        System.out.println("Digite o valor inicial");
        n = scr.nextInt();
        System.out.println("Digite o valor final");
        m = scr.nextInt();
        do{
            System.out.println("Numero" + n);
            n++;
        }while(n != m + 1 );
    }
}