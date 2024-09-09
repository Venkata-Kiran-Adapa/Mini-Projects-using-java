package Mini_Projects.Rock_Paper_Scissors;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose mode from the below:\nEnter 1 for Single Player\nEnter 2 for PLayer-1 vs Player-2");
        System.out.println("Enter your Mode Preference:");
        int opt=sc.nextInt();
        if(opt==1) rpsWithComputer();
        else if (opt==2) rps2Players();
        else System.out.println("Choose from the above 2 options only");
    }


    public static void rpsWithComputer(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int p1count=0,p2count=0;
        String p2="";
        while(true){
            System.out.println("choose one from the  below: \n1 for Rock\t2 for Paper\t3 for Scissor");
            System.out.println("Player Enter: ");
            int pi1=sc.nextInt();
            if((0>=pi1 || pi1>=4)) {
                System.out.println("Enter from above options only");
                continue;
            }
            String p1 = switch (pi1) {
                case 1 -> "rock";
                case 2 -> "paper";
                case 3 -> "scissor";
                default -> "nothing";
            };
            int random=rand.nextInt(3)+1;
            p2 = switch (random) {
                case 1 -> "rock";
                case 2 -> "paper";
                case 3 -> "scissor";
                default -> p2;
            };
            if((p1.equals("scissor") && p2.equals("rock") )|| (p1.equals("paper") && p2.equals("scissor")) || (p1.equals("rock") && p2.equals("paper")) ){
                p2count++;
            }
            else if((p1.equals("paper") && p2.equals("rock")) || (p1.equals("rock") && p2.equals("scissor")) ||(p1.equals("scissor") && p2.equals("paper"))){
                p1count++;
            }
            if(p1count==3){
                System.out.println("Player 1 Wins...!");
                break;
            }
            else if(p2count==3) {
                System.out.println("Computer wins....!");
                break;
            }
        }}


public static void rps2Players(){
        Scanner sc=new Scanner(System.in);
        int p1count=0,p2count=0;
        while(true){
            System.out.println("choose one from the  below: \n1 for Rock\t2 for Paper\t3 for Scissor");
            System.out.println("Player 1 Enter: ");
            int pi1=sc.nextInt();
            System.out.println("Player 2 Enter: ");
            int pi2=sc.nextInt();
            if((1>pi1 || pi1>3) || (1>pi2 || pi2>3)) {
                System.out.println("Enter from above options only");
                continue;
            }
            String p1 = switch (pi1) {
                case 1 -> "rock";
                case 2 -> "paper";
                case 3 -> "scissor";
                default -> "nothing";
            };
            String p2 = switch (pi2) {
                case 1 -> "rock";
                case 2 -> "paper";
                case 3 -> "scissor";
                default -> "nothing";
            };

            if((p1.equals("scissor") && p2.equals("rock") )|| (p1.equals("paper") && p2.equals("scissor")) || (p1.equals("rock") && p2.equals("paper")) ){
                p2count++;
            }
            else if((p1.equals("paper") && p2.equals("rock")) || (p1.equals("rock") && p2.equals("scissor")) ||(p1.equals("scissor") && p2.equals("paper"))){
                p1count++;
            }
            if(p1count==3){
                System.out.println("Player 1 Wins...!");
                break;
            }
            else if(p2count==3){
                System.out.println("Player 2 wins....!");
                break;
            }
        }
    }
}
