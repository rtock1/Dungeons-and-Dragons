package Items;

import HelperFunctions.*;
import java.util.Hashtable;

public class Weapon extends Item implements Finals{
    Hashtable<String, Boolean> properties;
    int range;
    String name;
    int damageType;
    int damageDiceType;
    int damageDiceAmount;
    public Weapon(){
        name = "Unarmed";
        damageType = BLUDGEONING;
        damageDiceType = 1;
        damageDiceAmount = 1;
        initHashtable();
    }
    public Weapon(boolean[] properties, String name, int damageType, int damageDiceAmount, int damageDiceType){
        this.name = name;
        this.damageType = damageType;
        this.damageDiceAmount = damageDiceAmount;
        this.damageDiceType = damageDiceType;
        initHashtable(properties);
    }
    public int[] getDamage(){
        return new int[]{damageDiceAmount,damageDiceType};
    }
    public int getDamageType(){
        return damageType;
    }
    private void initHashtable(){
        this.properties = new Hashtable<>();
        properties.put("Ammunition",false);
        properties.put("Finesse",false);
        properties.put("Heavy",false);
        properties.put("Light",false);
        properties.put("Loading",false);
        properties.put("Range",false);
        properties.put("Reach",false);
        properties.put("Thrown",false);
        properties.put("twoHanded",false);
        properties.put("Versatile",false);
        properties.put("Improvised",false);
        properties.put("Silvered",false);
    }
    private void initHashtable(boolean[] properties){
        this.properties = new Hashtable<>();
        if (properties.length > 11) {
            this.properties.put("Ammunition", properties[0]);
            this.properties.put("Finesse", properties[1]);
            this.properties.put("Heavy", properties[2]);
            this.properties.put("Light", properties[3]);
            this.properties.put("Loading", properties[4]);
            this.properties.put("Range", properties[5]);
            this.properties.put("Reach", properties[6]);
            this.properties.put("Thrown", properties[7]);
            this.properties.put("twoHanded", properties[8]);
            this.properties.put("Versatile", properties[9]);
            this.properties.put("Improvised", properties[10]);
            this.properties.put("Silvered", properties[11]);
        } else {
            initHashtable();
        }
    }
}
