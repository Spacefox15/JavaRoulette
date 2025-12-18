import java.util.Scanner;

public class Wheel {
    //payouts
    //Inside
        //Straight-up
            private static double straightUp = 35;
        //Split
            private double split = 17;
        //Trio
            private double trio;
        //Street
            private double street = 11;
        //Corner(or square)
            private double corner = 8;
        //Five number
            private double fiveNumber = 6;
        //Six line
            private double sixLine = 5;

    //Outside
        //Column
            private double colunm = 2; 
        //Dozen
            private double dozen = 2;
        //Red/black
            private double redBlack = 1;
        //Even/Odd
            private double evenOdd = 1;
        //Low/High
            private double lowHigh = 1;

    public static void rouletteWheel() {
    //Logic of gameplay
            Boolean play = true;
            Scanner input = new Scanner(System.in);
            double insideBet;
            String OutsideBet;
            double payout;


            //Which type of Roulette?
            while (play) {

                System.out.println("Do you want to play European or American Roulette?");
                System.out.printf(
                    "1. European\n" +
                    "2. American\n");
                String version = input.nextLine();
            //Type of bet
                //Inside or outside
                System.out.println("\nWhich type of bet do you want to make?");
                System.out.printf(
                    "1. Inside\n" +
                    "2. Outside\n"
                );
                String side = input.nextLine();
                    //Inside
                        if (side.equalsIgnoreCase("inside")) {
                                System.out.printf(
                                "\nWhat do you want to bet on?\n" +
                                "1. Straight-up \n" +
                                    "2. Split \n" +
                                    "3. Trio \n" +
                                    "4. Street \n" +
                                    "5. Corner(or square) \n" +
                                    "6. Five number \n" +
                                    "7. Six line\n"
                                );
                                int insideBetType = input.nextInt();

                                switch(insideBetType) {
                                case 1 -> { 
                                    //Straight-up
                                    //00-36 OR 0-36
                                    if (version.equalsIgnoreCase("european")){
                                        System.out.println("Which bet? (0-36)");
                                        insideBet = input.nextDouble();
                                        payout = straightUp;
                                    }
                                    else if (version.equalsIgnoreCase("american")) {
                                        System.out.println("Which bet? (00-36)");
                                        insideBet = input.nextDouble();
                                        payout = straightUp;                                        
                                    }
                                }
                                case 2 -> {
                                    //Split
                                    //2 numbers 00-36 OR 0-36
                                    System.out.println("Which numbers?");
                                    System.out.println("First Number: ");
                                    System.out.println("Second Number: ");
                                    }
                                case 3 ->{
                                    //Trio
                                    //3 numbers 00-36 OR 0-36
                                   
                                    }
                                case 4 ->{
                                    //Street
                                    //3 numbers 00-36 OR 0-36
                                    System.out.println("Which numbers?");
                                    System.out.println("First Number: ");
                                    System.out.println("Second Number: ");
                                    System.out.println("Third Number: ");                                     
                                    }
                                case 5 ->{
                                    //Corner(or square)
                                    //4 numbers 00-36 OR 0-36
                                    System.out.println("Which numbers?");
                                    System.out.println("First Number: ");
                                    System.out.println("Second Number: ");
                                    System.out.println("Third Number: ");                                     
                                    }
                                case 6 ->{
                                    //Five number
                                    //5 numbers 00-36 OR 0-36
                                    System.out.println("Which numbers?");
                                    System.out.println("First Number: ");
                                    System.out.println("Second Number: ");
                                    System.out.println("Third Number: ");                                     
                                    }
                                case 7 ->{
                                    //Six line
                                    //6 numbers 00-36 OR 0-36
                                    System.out.println("Which numbers?");
                                    System.out.println("First Number: ");
                                    System.out.println("Second Number: ");
                                    System.out.println("Third Number: ");                                     
                                    }
                                }
                            }
 

                    //Outside
                        else if (side.equalsIgnoreCase("outside")) {
                                System.out.printf(
                                "\nWhat do you want to bet on?\n" +
                                "1. Column \n" +
                                    "2. Dozen \n" +
                                    "3. Red/Black \n" +
                                    "4. Even/Odd \n" +
                                    "5. Low/High \n\n"
                                );
                                String type = input.nextLine();
                            }
           
                //Bet
                    //How much do you want to bet
                        System.out.println("How much do you want to bet?");
            //Roll
                //Roll Logic
                System.out.println("Rolling..."); //Implement Time logic
                //Output Result
                        //TODO Implement Rolling Logic
                    //print result
                    System.out.println("Result: ");  

                System.out.println("You Bet: ");   

                
            //Payout
                //Won
                    System.out.println("You Win!");
                    //betType
                    //betAmount * payout
                //Lost
                    System.out.println("You Lose.");
            // update account balance

            // Play again?
                System.out.println("Do you want to play again?");
                String playAgain = input.nextLine();
                if (playAgain.equalsIgnoreCase("yes")){
                    play = true;
                }
                // If not close
                else {
                    play = false;             
                }
            }
        }

}