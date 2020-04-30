package backgroun.statBlock;

import backgroun.DiceRoll;

public class RolledStats {
    private int str;    //strength stat
    private int dex;    //dexterity stat
    private int con;    //constitution stat
    private int intl;   //intelligence stat
    private int wis;    //wisdom stat
    private int cha;    // charisma stat
    public RolledStats(int str, int dex, int con, int intl, int wis, int cha) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.intl = intl;
        this.wis = wis;
        this.cha = cha;
    }
    public RolledStats() {
        this.str = DiceCombo.discardLowest(DiceRoll.rollSix(4),true);
        this.dex = DiceCombo.discardLowest(DiceRoll.rollSix(4),true);
        this.con = DiceCombo.discardLowest(DiceRoll.rollSix(4),true);
        this.intl = DiceCombo.discardLowest(DiceRoll.rollSix(4),true);
        this.wis = DiceCombo.discardLowest(DiceRoll.rollSix(4),true);
        this.cha = DiceCombo.discardLowest(DiceRoll.rollSix(4),true);
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        if (str < 21) {
            this.str = str; }
        else {
            System.out.println("Stat should be lower than 21");
        }

    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        if (dex < 21) {
            this.dex = dex; }
        else {
            System.out.println("Stat should be lower than 21");
        }
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        if (con < 21) {
            this.con = con; }
        else {
            System.out.println("Stat should be lower than 21");
        }

    }

    public int getIntl() {
        return intl;
    }

    public void setIntl(int intl) {
        if (intl < 21) {
        this.intl = intl; }
    else {
        System.out.println("Stat should be lower than 21");
    }
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        if (wis < 21) {
            this.wis = wis; }
        else {
            System.out.println("Stat should be lower than 21");
        }
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        if (cha < 21) {
            this.cha = cha; }
        else {
            System.out.println("Stat should be lower than 21");
        }
    }


}
