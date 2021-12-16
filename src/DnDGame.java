import Creatures.*;
import Creatures.Enemies.*;
import Items.*;
import HelperFunctions.*;

public class DnDGame implements Finals{
    Creature[] creatureOrder;
    Player player1;
    int playerLevel = 1;
    public void startGame(){
        player1 = new Player("Brave adventurer",12,new boolean[13],30,new int[]{20,10,10,10,10,10},4, new Weapon(GREATSWORD_PROPERTIES, GREATSWORD_NAME, GREATSWORD_DAMAGE_TYPE, GREATSWORD_DICE_AMOUNT, GREATSWORD_DICE_TYPE), new Armor());
        while (true) {
            startGame2();
            playerLevel++;
        }
    }
    public void startGame2(){
        System.out.print("How many goblins do you wish to fight?\n>>> ");
        int goblins = TextIO.getlnInt();
        Creature[] creatures = new Creature[goblins + 1];
        creatures[0] = player1;
        for (int i=1;i<creatures.length;i++){
            creatures[i] = new Goblin();
        }
        creatureOrder = getOrder(creatures);
        int totalzeroes;
        while (true){
            combatRound(creatures);
            boolean playerDead = false;
            totalzeroes = 0;
            for (Creature c: creatures) {
                try {
                    Player player = (Player) c;
                    if (player.getHealth() <= 0) {
                        System.out.println("Your health was lowered to 0. Game over");
                        playerDead = true;
                    }
                } catch (Exception e) {
                    if (c.getHealth() <= 0) {
                        totalzeroes++;
                    }
                }
            }
            if (totalzeroes == creatures.length-1){
                System.out.println("You killed all the goblins, good job");
                int healthGain = Roll.rollDice(1,12);
                System.out.println("You leveled up. Now level "+(playerLevel+1)+", gaining "+healthGain+" more health.");
                player1.setHealth(player1.getHealth()+healthGain);
                System.out.println("Current health is "+player1.getHealth()+".");
                break;
            } else if (playerDead){
                break;
            }
        }

    }
    public void combatRound(Creature[] creatures){
        for (Creature c: creatures) {
            try {
                Player player = (Player) c;
                boolean attackWorked = false;
                while (!attackWorked) {
                    System.out.print("Which goblin do you wish to attack? (Goblin 1 - Goblin " + (creatures.length - 1) + ")\n>>> ");
                    int attacking = TextIO.getlnInt();
                    attackWorked = player.Attack(creatures[attacking]) == 0;
                    if (!attackWorked){
                        System.out.println("Attack failed, creature is dead, please try again");
                    }
                }

            } catch (Exception e) {
                if (c.getHealth()>0) {
                    c.attackCreature(creatures[0]);
                }
            }
        }
    }
    public static Creature[] getOrder(Creature[] creatures){
        int[] rolls = new int[creatures.length];
        for (int i=0;i<creatures.length;i++){
            rolls[i] = creatures[i].rollInit();
        }
        Creature[] finalOrder = new Creature[creatures.length];
        for (int i=0;i<rolls.length;i++){
            int largest = 100;
            int largestIndex = -1;
            for (int a=0;a<rolls.length;a++){
                if (rolls[a] < largest){
                    largest = rolls[a];
                    largestIndex = a;
                }
            }
            rolls[largestIndex] = 100;
            finalOrder[i] = creatures[largestIndex];
        }
        return finalOrder;
    }
}
