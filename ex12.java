import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o numero desejado");
        int num = scr.nextInt();
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }
    
}
