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

        Wheel wheel = new Wheel();
        wheel.rouletteWheel();        


    }
}
