package HelperFunctions;

public interface Finals {
    //Weapon Types
    int SIMPLE_MELEE = 0;
    int SIMPLE_RANGED = 1;
    int MARTIAL_MELEE = 2;
    int MARTIAL_RANGED = 3;

    //Damage types
    int ACID = 0;
    int BLUDGEONING = 1;
    int COLD = 2;
    int FIRE = 3;
    int FORCE = 4;
    int LIGHTNING = 5;
    int NECROTIC = 6;
    int PIERCING = 7;
    int POISON = 8;
    int PSYCHIC = 9;
    int RADIANT = 10;
    int SLASHING = 11;
    int THUNDER = 12;

    //CR <1
    int CR_ZERO = -3;
    int CR_EIGHTH = -2;
    int CR_FOURTH = -1;
    int CR_HALF = 0;

    //Size
    int SIZE_TINY = 0;
    int SIZE_SMALL = 1;
    int SIZE_MEDIUM = 2;
    int SIZE_LARGE = 3;
    int SIZE_HUGE = 4;
    int SIZE_GARGANTUAN = 5;

    //Weapon properties
    boolean[] CLUB_PROPERTIES = new boolean[]{false, false, false, true, false, false, false, false, false, false, false, false};
    boolean[] DAGGER_PROPERTIES = new boolean[]{false, true, false, true, false, true, false, true, false, false, false, false};
    boolean[] GREATCLUB_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, true, false, false, false};
    boolean[] HANDAXE_PROPERTIES = new boolean[]{false, false, false, true, false, true, false, true, false, false, false, false};
    boolean[] JAVELIN_PROPERTIES = new boolean[]{false, false, false, false, false, true, false, true, false, false, false, false};
    boolean[] LIGHT_HAMMER_PROPERTIES = new boolean[]{false, false, false, true, false, true, false, true, false, false, false, false};
    boolean[] MACE_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
    boolean[] QUARTERSTAFF_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, false, true, false, false};
    boolean[] SICKLE_PROPERTIES = new boolean[]{false, false, false, true, false, false, false, false, false, false, false, false};
    boolean[] SPEAR_PROPERTIES = new boolean[]{false, false, false, false, false, true, false, true, false, true, false, false};
    boolean[] LIGHT_CROSSBOW_PROPERTIES = new boolean[]{true, false, false, false, true, true, false, false, true, false, false, false};
    boolean[] DART_PROPERTIES = new boolean[]{false, true, false, false, false, true, false, true, false, false, false, false};
    boolean[] SHORTBOW_PROPERTIES = new boolean[]{true, false, false, false, false, true, false, false, true, false, false, false};
    boolean[] SLING_PROPERTIES = new boolean[]{true, false, false, false, false, true, false, false, false, false, false, false};
    boolean[] BATTLEAXE_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, false, true, false, false};
    boolean[] FLAIL_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
    boolean[] GLAIVE_PROPERTIES = new boolean[]{false, false, true, false, false, false, true, false, true, false, false, false};
    boolean[] GREATAXE_PROPERTIES = new boolean[]{false, false, true, false, false, false, false, false, true, false, false, false};
    boolean[] GREATSWORD_PROPERTIES = new boolean[]{false, false, true, false, false, false, false, false, true, false, false, false};
    boolean[] HALBERD_PROPERTIES = new boolean[]{false, false, true, false, false, false, true, false, true, false, false, false};
    boolean[] LANCE_PROPERTIES = new boolean[]{false, false, false, false, false, false, true, false, false, false, false, false};
    boolean[] LONGSWORD_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, false, true, false, false};
    boolean[] MAUL_PROPERTIES = new boolean[]{false, false, true, false, false, false, false, false, true, false, false, false};
    boolean[] MORNINGSTAR_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
    boolean[] PIKE_PROPERTIES = new boolean[]{false, false, true, false, false, false, true, false, true, false, false, false};
    boolean[] RAPIER_PROPERTIES = new boolean[]{false, true, false, false, false, false, false, false, false, false, false, false};
    boolean[] SCIMITAR_PROPERTIES = new boolean[]{false, true, false, true, false, false, false, false, false, false, false, false};
    boolean[] SHORTSWORD_PROPERTIES = new boolean[]{false, true, false, true, false, false, false, false, false, false, false, false};
    boolean[] TRIDENT_PROPERTIES = new boolean[]{false, false, false, false, false, true, false, true, false, true, false, false};
    boolean[] WAR_PICK_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
    boolean[] WARHAMMER_PROPERTIES = new boolean[]{false, false, false, false, false, false, false, false, false, true, false, false};
    boolean[] WHIP_PROPERTIES = new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false};
    boolean[] BLOWGUN_PROPERTIES = new boolean[]{true, true, false, false, true, true, false, false, false, false, false, false};
    boolean[] HAND_CROSSBOW_PROPERTIES = new boolean[]{true, true, false, true, true, true, false, false, false, false, false, false};
    boolean[] HEAVY_CROSSBOW_PROPERTIES = new boolean[]{true, true, true, false, true, true, false, false, true, false, false, false};
    boolean[] LONGBOW_PROPERTIES = new boolean[]{true, false, true, false, false, true, false, false, true, false, false, false};

    //Weapon names (To avoid typos)
    String CLUB_NAME = "Club";
    String DAGGER_NAME = "Dagger";
    String GREATCLUB_NAME = "Greatclub";
    String HANDAXE_NAME = "Handaxe";
    String JAVELIN_NAME = "Javelin";
    String LIGHT_HAMMER_NAME = "Light Hammer";
    String MACE_NAME = "Mace";
    String QUARTERSTAFF_NAME = "Quarterstaff";
    String SICKLE_NAME = "Sickle";
    String SPEAR_NAME = "Spear";
    String LIGHT_CROSSBOW_NAME = "Light Crossbow";
    String DART_NAME = "Dart";
    String SHORTBOW_NAME = "Shortbow";
    String SLING_NAME = "Sling";
    String BATTLEAXE_NAME = "Battleaxe";
    String FLAIL_NAME = "Flail";
    String GLAIVE_NAME = "Glaive";
    String GREATAXE_NAME = "Greataxe";
    String GREATSWORD_NAME = "Greatsword";
    String HALBERD_NAME = "Halberd";
    String LANCE_NAME = "Lance";
    String LONGSWORD_NAME = "Longsword";
    String MAU_NAMEL = "Maul";
    String MORNINGSTAR_NAME = "Morningstar";
    String PIKE_NAME = "Pike";
    String RAPIER_NAME = "Rapier";
    String SCIMITAR_NAME = "Scimitar";
    String SHORTSWORD_NAME = "Shortsword";
    String TRIDENT_NAME = "Trident";
    String WAR_PICK_NAME = "War Pick";
    String WARHAMMER_NAME = "Warhammer";
    String WHIP = "Whip";
    String BLOWGUN = "Blowgun";
    String HAND_CROSSBOW = "Hand Crossbow";
    String HEAVY_CROSSBOW = "Heavy Crossbow";
    String LONGBOW = "Longbow";

    //Weapon damage types
    int CLUB_DAMAGE_TYPE = BLUDGEONING;
    int DAGGER_DAMAGE_TYPE = PIERCING;
    int GREATCLUB_DAMAGE_TYPE = BLUDGEONING;
    int HANDAXE_DAMAGE_TYPE = SLASHING;
    int JAVELIN_DAMAGE_TYPE = PIERCING;
    int LIGHT_HAMMER_DAMAGE_TYPE = BLUDGEONING;
    int MACE_DAMAGE_TYPE = BLUDGEONING;
    int QUARTERSTAFF_DAMAGE_TYPE = BLUDGEONING;
    int SICKLE_DAMAGE_TYPE = SLASHING;
    int SPEAR_DAMAGE_TYPE = PIERCING;
    int LIGHT_CROSSBOW_DAMAGE_TYPE = PIERCING;
    int DART_DAMAGE_TYPE = PIERCING;
    int SHORTBOW_DAMAGE_TYPE = PIERCING;
    int SLING_DAMAGE_TYPE = BLUDGEONING;
    int BATTLEAXE_DAMAGE_TYPE = SLASHING;
    int FLAIL_DAMAGE_TYPE = BLUDGEONING;
    int GLAIVE_DAMAGE_TYPE = SLASHING;
    int GREATAXE_DAMAGE_TYPE = SLASHING;
    int GREATSWORD_DAMAGE_TYPE = SLASHING;
    int HALBERD_DAMAGE_TYPE = SLASHING;
    int LANCE_DAMAGE_TYPE = PIERCING;
    int LONGSWORD_DAMAGE_TYPE = SLASHING;
    int MAUL_DAMAGE_TYPE = BLUDGEONING;
    int MORNINGSTAR_DAMAGE_TYPE = PIERCING;
    int PIKE_DAMAGE_TYPE = PIERCING;
    int RAPIER_DAMAGE_TYPE = PIERCING;
    int SCIMITAR_DAMAGE_TYPE = SLASHING;
    int SHORTSWORD_DAMAGE_TYPE = PIERCING;
    int TRIDENT_DAMAGE_TYPE = PIERCING;
    int WAR_PICK_DAMAGE_TYPE = PIERCING;
    int WARHAMMER_DAMAGE_TYPE = BLUDGEONING;
    int WHIP_DAMAGE_TYPE = SLASHING;
    int BLOWGUN_DAMAGE_TYPE = PIERCING;
    int HAND_CROSSBOW_DAMAGE_TYPE = PIERCING;
    int HEAVY_CROSSBOW_TYPE = PIERCING;
    int LONGBOW_DAMAGE_TYPE = PIERCING;

    //Weapon dice amount
    int CLUB_DICE_AMOUNT = 1;
    int DAGGER_DICE_AMOUNT = 1;
    int GREATCLUB_DICE_AMOUNT = 1;
    int HANDAXE_DICE_AMOUNT = 1;
    int JAVELIN_DICE_AMOUNT = 1;
    int LIGHT_HAMMER_DICE_AMOUNT = 1;
    int MACE_DICE_AMOUNT = 1;
    int QUARTERSTAFF_DICE_AMOUNT = 1;
    int SICKLE_DICE_AMOUNT = 1;
    int SPEAR_DICE_AMOUNT = 1;
    int LIGHT_CROSSBOW_DICE_AMOUNT = 1;
    int DART_DICE_AMOUNT = 1;
    int SHORTBOW_DICE_AMOUNT = 1;
    int SLING_DICE_AMOUNT = 1;
    int BATTLEAXE_DICE_AMOUNT = 1;
    int FLAIL_DICE_AMOUNT = 1;
    int GLAIVE_DICE_AMOUNT = 1;
    int GREATAXE_DICE_AMOUNT = 1;
    int GREATSWORD_DICE_AMOUNT = 2;
    int HALBERD_DICE_AMOUNT = 1;
    int LANCE_DICE_AMOUNT = 1;
    int LONGSWORD_DICE_AMOUNT = 1;
    int MAUL_DICE_AMOUNT = 2;
    int MORNINGSTAR_DICE_AMOUNT = 1;
    int PIKE_DICE_AMOUNT = 1;
    int RAPIER_DICE_AMOUNT = 1;
    int SCIMITAR_DICE_AMOUNT = 1;
    int SHORTSWORD_DICE_AMOUNT = 1;
    int TRIDENT_DICE_AMOUNT = 1;
    int WAR_PICK_DICE_AMOUNT = 1;
    int WARHAMMER_DICE_AMOUNT = 1;
    int WHIP_DICE_AMOUNT = 1;
    int BLOWGUN_DICE_AMOUNT = 1;
    int HAND_CROSSBOW_DICE_AMOUNT = 1;
    int HEAVY_CROSSBOW_DICE_AMOUNT = 1;
    int LONGBOW_DICE_AMOUNT = 1;

    //Weapon dice type
    int CLUB_DICE_TYPE = 4;
    int DAGGER_DICE_TYPE = 4;
    int GREATCLUB_DICE_TYPE = 8;
    int HANDAXE_DICE_TYPE = 6;
    int JAVELIN_DICE_TYPE = 6;
    int LIGHT_HAMMER_DICE_TYPE = 4;
    int MACE_DICE_TYPE = 6;
    int QUARTERSTAFF_DICE_TYPE = 6;
    int SICKLE_DICE_TYPE = 4;
    int SPEAR_DICE_TYPE = 6;
    int LIGHT_CROSSBOW_DICE_TYPE = 8;
    int DART_DICE_TYPE = 4;
    int SHORTBOW_DICE_TYPE = 6;
    int SLING_DICE_TYPE = 4;
    int BATTLEAXE_DICE_TYPE = 8;
    int FLAIL_DICE_TYPE = 8;
    int GLAIVE_DICE_TYPE = 10;
    int GREATAXE_DICE_TYPE = 12;
    int GREATSWORD_DICE_TYPE = 6;
    int HALBERD_DICE_TYPE = 10;
    int LANCE_DICE_TYPE = 12;
    int LONGSWORD_DICE_TYPE = 8;
    int MAUL_DICE_TYPE = 6;
    int MORNINGSTAR_DICE_TYPE = 8;
    int PIKE_DICE_TYPE = 10;
    int RAPIER_DICE_TYPE = 8;
    int SCIMITAR_DICE_TYPE = 6;
    int SHORTSWORD_DICE_TYPE = 6;
    int TRIDENT_DICE_TYPE = 6;
    int WAR_PICK_DICE_TYPE = 8;
    int WARHAMMER_DICE_TYPE = 8;
    int WHIP_DICE_TYPE = 4;
    int BLOWGUN_DICE_TYPE = 1;
    int HAND_CROSSBOW_DICE_TYPE = 6;
    int HEAVY_CROSSBOW_DICE_TYPE = 10;
    int LONGBOW_DICE_TYPE = 8;

    //Ranged weapon ranges
    int[] DAGGER_RANGE = new int[]{20, 60};
    int[] HANDAXE_RANGE = new int[]{20, 60};
    int[] JAVELIN_RANGE = new int[]{30, 120};
    int[] LIGHT_HAMMER_RANGE = new int[]{20, 60};
    int[] SPEAR_RANGE = new int[]{20, 60};
    int[] LIGHT_CROSSBOW_RANGE = new int[]{80, 320};
    int[] DART_RANGE = new int[]{20, 60};
    int[] SHORTBOW_RANGE = new int[]{80, 320};
    int[] SLING_RANGE = new int[]{30, 120};
    int[] TRIDENT_RANGE = new int[]{20, 60};
    int[] BLOWGUN_RANGE = new int[]{25, 100};
    int[] HAND_CROSSBOW_RANGE = new int[]{30, 120};
    int[] HEAVY_CROSSBOW_RANGE = new int[]{100, 400};
    int[] LONGBOW_RANGE = new int[]{150, 600};

    //Armor type
    int LIGHT_ARMOR = 0;
    int MEDIUM_ARMOR = 1;
    int HEAVY_ARMOR = 2;

    //Armor name (to avoid typos)
    String PADDED_NAME = "Padded";
    String LEATHER_NAME = "Leather";
    String STUDDED_LEATHER_NAME = "Studded leather";
    String HIDE_NAME = "Hide";
    String CHAIN_SHIRT_NAME = "Chain shirt";
    String SCALE_MAIL_NAME = "Scale mail";
    String BREASTPLATE_NAME = "Breastplate";
    String HALF_PLATE_NAME = "Half plate";
    String RING_MAIL_NAME = "Ring mail";
    String CHAIN_MAIL_NAME = "Chain mail";
    String SPLINT_NAME = "Splint";
    String PLATE_NAME = "Plate";

    //Armor types
    int PADDED_TYPE = LIGHT_ARMOR;
    int LEATHER_TYPE = LIGHT_ARMOR;
    int STUDDED_LEATHER_TYPE = LIGHT_ARMOR;
    int HIDE_TYPE = MEDIUM_ARMOR;
    int CHAIN_SHIRT_TYPE = MEDIUM_ARMOR;
    int SCALE_MAIL_TYPE = MEDIUM_ARMOR;
    int BREASTPLATE_TYPE = MEDIUM_ARMOR;
    int HALF_PLATE_TYPE = MEDIUM_ARMOR;
    int RING_MAIL_TYPE = HEAVY_ARMOR;
    int CHAIN_MAIL_TYPE = HEAVY_ARMOR;
    int SPLINT_TYPE = HEAVY_ARMOR;
    int PLATE_TYPE = HEAVY_ARMOR;

    //AC
    int PADDED_AC = 11;
    int LEATHER_AC = 11;
    int STUDDED_LEATHER_AC = 12;
    int HIDE_AC = 12;
    int CHAIN_SHIRT_AC = 13;
    int SCALE_MAIL_AC = 14;
    int BREASTPLATE_AC = 14;
    int HALF_PLATE_AC = 15;
    int RING_MAIL_AC = 14;
    int CHAIN_MAIL_AC = 16;
    int SPLINT_AC = 17;
    int PLATE_AC = 18;

    //Strength
    int PADDED_STRENGTH = 0;
    int LEATHER_STRENGTH = 0;
    int STUDDED_LEATHER_STRENGTH = 0;
    int HIDE_STRENGTH = 0;
    int CHAIN_SHIRT_STRENGTH = 0;
    int SCALE_MAIL_STRENGTH = 0;
    int BREASTPLATE_STRENGTH = 0;
    int HALF_PLATE_STRENGTH = 0;
    int RING_MAIL_STRENGTH = 0;
    int CHAIN_MAIL_STRENGTH = 13;
    int SPLINT_STRENGTH = 15;
    int PLATE_STRENGTH = 5;
}
