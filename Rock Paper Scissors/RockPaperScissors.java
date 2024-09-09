package Mini_Projects;
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
    public static void rps2Players(){
        Scanner sc=new Scanner(System.in);
        int p1count=0,p2count=0;
        while(true){
            System.out.println("Type one from the  below: \n1.Rock\t2.Paper\t3.Scissor");
            System.out.println("Player 1 Enter: ");
            String p1=sc.nextLine().toLowerCase().trim();
            System.out.println("Player 2 Enter: ");
            String p2=sc.nextLine().toLowerCase().trim();
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
    public static void rpsWithComputer(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int p1count=0,p2count=0;
        String p2="";
        while(true){
            System.out.println("Type one from the  below: \n1.Rock\t2.Paper\t3.Scissor");
            System.out.println("Player 1 Enter: ");
            String p1=sc.nextLine().toLowerCase().trim();
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
}
