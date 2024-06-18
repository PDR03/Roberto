import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int qnt = 0, idd = 0, midd = 0, mnidd = 0, m65 = 0, media = 0;
        while (qnt != 11) {
            System.out.println("Digite sua idade");
            idd = scr.nextInt();
            media += idd;
            if(idd < 18){
                mnidd++;
            }else if(idd >= 18 && idd < 66){
                midd++;
            }else{
                m65++;
            }
            qnt++;
        }
        media = media / qnt;
        System.out.println("tem " + mnidd + " menores de idade");
        System.out.println("tem " + midd + " maiores de idade");
        System.out.println("tem " + m65 + " maiores de 65 de idade");
        System.out.println("A media de idade é " + media);
    }
}
