package Creatures;

import java.util.ArrayList;
import Items.*;
import HelperFunctions.*;

public class Player extends Creature {
    ArrayList<Item> inventory = new ArrayList<>();
    public Player(String name, int health, boolean[] resistances, int speed, int[] stats, int size, Weapon weapon, Armor armor){
        super(name, health,resistances,speed,stats,size, weapon, armor);
    }
    public int Attack(Creature c){
        System.out.println("Attacking creature");
        int creatureHealth = c.getHealth();
        if (creatureHealth <= 0){
            return -1;
        }
        this.attackCreature(c);
        if (creatureHealth != c.getHealth()){
            System.out.println("You hit the creature, dealing "+(creatureHealth-c.getHealth())+" damage");
        } else {
            System.out.println("You missed");
        }
        return 0;
    }
    public void takeDamage(int damageType, int damage){
        if (resistances[damageType]){
            health -= damage / 2;
            System.out.println("You were hit for "+damage+" "+DamageType.getString(damageType)+" damage. Luckily you are resistant to "+DamageType.getString(damageType)+" damage, so you only took "+ damage/2+" damage");
        } else {
            health -= damage;
            System.out.println("You were hit for "+damage+" "+DamageType.getString(damageType)+" damage");
        }
    }
}
