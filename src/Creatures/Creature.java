package Creatures;

import Items.*;
import HelperFunctions.*;

public class Creature {
    int health;
    boolean[] resistances;
    int speed;
    int[] stats;
    int size;
    Weapon weapon;
    Armor armor;
    String name;

    protected Creature(String name, int health, boolean[] resistances, int speed, int[] stats, int size, Weapon weapon, Armor armor){
        this.health = health;
        if (resistances.length == 13) {
            this.resistances = resistances;
        } else if (resistances.length > 13){
            this.resistances = new boolean[13];
        } else {
            this.resistances = new boolean[13];
            for (int i=0;i<13;i++){
                if(i<resistances.length){
                    this.resistances[i] = resistances[i];
                }
            }
        }
        this.speed = speed;
        this.stats = stats;
        this.size = size;
        this.weapon = weapon;
        this.armor = armor;
        this.name = name;
    }

    private void takeDamage(int damageType, int damage, Creature c){
        try {
            ((Player) this).takeDamage(damageType, damage);
        } catch (Exception e) {
            if (resistances[damageType]){
                health -= damage / 2;
            } else {
                health -= damage;
            }
        }
    }
    public void processHit(int modifier, Weapon w, Creature c){
        if (Roll.rollDice(1,20) + modifier>=armor.getAC(stats[1])){
            this.takeDamage(w.getDamageType(), Roll.rollDice(w.getDamage())+Stats.getModifier(c.getStats()[0]),c);
        }
    }
    public int rollInit(){
        return Roll.rollDice(1,20) + stats[1];
    }
    public int getHealth(){
        return health;
    }
    public String toString(){
        return "Name: "+name + "\nHealth: "+health;
    }
    public int attackCreature(Creature c){
        if (c.getHealth() > 0) {
            c.processHit(Stats.getModifier(stats[0] + 2), weapon, this);
        } else {
            return -1;
        }
        return 0;
    }
    public int[] getStats(){
        return stats;
    }
}
