package com.github.KubanD936.pokedex;

//ID, Number, Name, Type1, Type2, Total, HP, Atk, Def, SpAtk, SpDef, Spd, Species, Height, Weight
public class Pokemon {
    private String ID;
    private String Number;
    private String Name;
    private String Type1;
    private String Type2;
    private String Total;
    private String Hp;
    private String Atk;
    private String Def;
    private String SpAtk;
    private String SpDef;
    private String Spd;
    private String Species;
    private String Height;
    private String Weight;

    public Pokemon(String ID, String number, String name, String type1, String type2, String total, String hp, String atk, String def, String spAtk, String spDef, String spd, String species, String height, String weight) {
        this.ID = ID;
        Number = number;
        Name = name;
        Type1 = type1;
        Type2 = type2;
        Total = total;
        Hp = hp;
        Atk = atk;
        Def = def;
        SpAtk = spAtk;
        SpDef = spDef;
        Spd = spd;
        Species = species;
        Height = height;
        Weight = weight;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
}



