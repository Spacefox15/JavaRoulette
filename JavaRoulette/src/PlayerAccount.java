public class PlayerAccount {
    private String playerName;
    private double accountBalance;

    public PlayerAccount(String playerName, double accountBalance) {
        this.playerName = playerName;
        this.accountBalance = accountBalance;
    } 

    public String getPlayerName(){
        return this.playerName;
    }
    public double getaccountBalance(){
        return this.accountBalance;
    }
    public String playerInfo(){
        return 
        "\n************Player Info************" +
        "\nPlayer Name: " + this.playerName + 
        "\nAccount Balance: $" + this.accountBalance +
        "\n***********************************\n";
    }
    

    @Override public String toString(){
        return "Player Name: " + playerName + 
        "\nAccount Balance: " + accountBalance;
    }
}
