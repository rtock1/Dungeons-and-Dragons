package HelperFunctions;

public class DamageType {
    public static String getString(int damageType){
        switch (damageType){
            case 0:
                return "acid";
            case 1:
                return "bludgeoning";
            case 2:
                return "cold";
            case 3:
                return "fire";
            case 4:
                return "force";
            case 5:
                return "lightning";
            case 6:
                return "necrotic";
            case 7:
                return "piercing";
            case 8:
                return "poison";
            case 9:
                return "psychic";
            case 10:
                return "radiant";
            case 11:
                return "slashing";
            case 12:
                return "thunder";
        }
        return "";
    }
}
