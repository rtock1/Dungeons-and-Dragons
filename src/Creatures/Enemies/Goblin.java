package Creatures.Enemies;

import Creatures.Enemy;
import HelperFunctions.*;
import Items.*;
import java.util.ArrayList;

public class Goblin extends Enemy implements Finals{

    Armor currArmor;
    Weapon currWeapon;
    ArrayList<Item> Items = new ArrayList<>();

    public Goblin(){
        super("Goblin", Roll.rollDice(2,6), new boolean[13], 30, new int[]{8,14,10,10,8,8}, SIZE_SMALL, CR_FOURTH, new Weapon(SCIMITAR_PROPERTIES,SCIMITAR_NAME,SCIMITAR_DAMAGE_TYPE,SCIMITAR_DICE_AMOUNT,SCIMITAR_DAMAGE_TYPE), new Armor(LEATHER_TYPE,  LEATHER_NAME, LEATHER_AC));
        Armor currArmor = new Armor(LEATHER_TYPE, LEATHER_NAME, LEATHER_AC);
        Weapon currWeapon = new Weapon(SCIMITAR_PROPERTIES, SCIMITAR_NAME, SCIMITAR_DAMAGE_TYPE, SCIMITAR_DICE_AMOUNT, SCIMITAR_DICE_TYPE);
    }
}
