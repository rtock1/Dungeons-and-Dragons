package HelperFunctions;

public class Roll {
    public static int rollDice(int diceAmount, int diceType){
        int end = 0;
        for (int i=0;i<diceAmount;i++){
            end += (int) (Math.random() * diceType + 1);
        }
        return end;
    }
    public static int rollDice(int[] diceStats){
        return rollDice(diceStats[0],diceStats[1]);
    }
}
