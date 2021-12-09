package Creatures;

import Items.*;

public class Enemy extends Creature {
    int cr;
    public Enemy(String name, int health, boolean[] resistances, int speed, int[] stats, int size, int cr, Weapon weapon, Armor armor){
        super(name, health, resistances, speed, stats, size, weapon, armor);
        this.cr = cr;
    }
}
