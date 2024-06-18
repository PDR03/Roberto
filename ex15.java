import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int val1,val2, soma = 0;
        val1 = scr.nextInt();
        val2 = scr.nextInt();
        for(int i = val1;i <= val2; i++ ){
            soma += i;
            System.out.println(soma);
        }

    }
}
