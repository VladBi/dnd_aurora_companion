package backgroun;

import backgroun.classes.CharClass;
import backgroun.races.Race;

import backgroun.statBlock.RolledStats;
import backgroun.statBlock.Skills;

public class Character {
    private RolledStats initialRoll;
    private CharClass charClass;
    private Race race;
    private Appearance appearance;
    private Skills skills;
    private Inventory inventory;




    public Character() {
        initialRoll = new RolledStats();
    }

}
