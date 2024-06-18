import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o numero max");
        int num = scr.nextInt();

        System.out.println("impares");
        for(int i= 0;i <= num; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("Pares");
        for(int i= 0;i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        
    }
}
