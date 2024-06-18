import java.util.Scanner;

public class jex16 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int pri = 0,seg = 0,ter = 0,red,resp, pag = 0, qntl = 0,totpag = 0, gostadred = 0, respred;
        System.out.println("Diga a quantidade de alunos");
        int alunos = scr.nextInt();
        for(int i = 0; i < alunos; i++){
            System.out.println("Turma 1- primeiro ano 2- segundo ano 3- terceiro ano");
            resp = scr.nextInt();
            switch (resp) {
                case 1:
                    pri++;
                    break;
                case 2:
                    seg++;
                    break;
                case 3:
                    ter++;
                    break;
            
                default:
                System.out.println("Opção invalida");
                    break; 
            }
            System.out.println("Quantos livros voce leu?");
             pag = scr.nextInt();
             totpag += pag;
             if(resp == 2 && pag > qntl){
                qntl++;
             }
            System.out.println("Você gosta de fazer redação? (1-sim 2-não)");
             respred = scr.nextInt();
            if(resp== 1 && respred == 2){
                gostadred++;

            }
        }
        double porcent = (alunos * gostadred) / 100;
        System.out.println("Quantidade de alunos que está no 3°ano" + ter);
        System.out.println("A maior quantidade de livros lidos por um aluno do segundo ano é " + qntl );
        System.out.println("A porcentagem dos alunos do 1° ano que gostam de redação é" + porcent);
    }
}
