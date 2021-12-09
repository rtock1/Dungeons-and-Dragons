package Items;

import HelperFunctions.*;

public class Armor extends Item implements Finals{
    int type;
    String name;
    int AC;
    public Armor(){
        type = LIGHT_ARMOR;
        name = "None";
        AC = 10;
    }
    public Armor(int type, String name, int AC){
        this.type = type;
        this.name = name;
        this.AC = AC;
    }
    public int getAC(int dex){
        int pDex = Stats.getModifier(dex);
        if (type == LIGHT_ARMOR){
            return AC + pDex;
        } else if (type == MEDIUM_ARMOR){
            if (pDex>2){
                return AC + 2;
            } else {
                return AC + pDex;
            }
        } else {
            return AC;
        }
    }
}
