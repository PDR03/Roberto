import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String nome, flag = "sim";
        int idd;
        do{
            System.out.println("Qual seu nome?");
            nome = scr.nextLine();
            System.out.println("Qual sua idade ");
            idd = scr.nextInt();
            scr.nextLine();
            System.out.println("O usuario " + nome + " tem " + idd + " anos");
            System.out.println("Deseja continuar? (sim ou  não)");
            flag = scr.nextLine();
        }while (!flag.equals("não"));
    }
}
