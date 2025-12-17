import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        

        //Player Creation
        System.out.print("Enter a Player Name: ");
        String name = input.nextLine();
        System.out.print("Enter Starting Account Balance: ");
        double balance = input.nextDouble();
        
        input.close();

        PlayerAccount player1 = new PlayerAccount(name,balance);


        System.out.println(player1.playerInfo());

        //Logic of gameplay
            //Which type of Roulette?
            //     System.out.println("Do you want to play European or American Roulette?");
            // //Type of bet
            //     System.out.println("Which type of bet do you want to make");
            //     System.out.println("Which do you want to bet on?");
            // //How much do you want to bet
            //     System.out.print("How much do you want to bet?");
            // //Roll
            // //Output Result
            // //Payout
            //update account balance
            //Play again?
            //If not cloase




    }
}
