import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = scr.next();
        for(int i = 1; i < 100; i++){
            System.out.println(name);
        }
    }
}
