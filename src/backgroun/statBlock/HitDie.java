package backgroun.statBlock;

import backgroun.classes.CharClass;
import java.util.Arrays;

public class HitDie {
    private boolean multiclass;
    private int[] typeDie;
    private int[] amountOfDie;
    public HitDie(boolean isMulticlass, CharClass... charClass) {
        this.multiclass = isMulticlass;
        this.typeDie = new int[charClass.length];
        this.amountOfDie = new int[charClass.length];
        for (int i =0 ; i < charClass.length; i++) {
            this.typeDie[i] = charClass[i].getHitDie();
            this.amountOfDie[i] = 1 ;
        }
    }

    public int[] getTypeDie() {
        return typeDie;
    }

    public int[] getAmountOfDie() {
        return amountOfDie;
    }
    //single class
    public void levelUp() {
        this.amountOfDie[0]++;
    }
    //multiclass
    public void levelUp(CharClass charClass) {

        for (int i = 0 ; i < this.typeDie.length ; i++) {
            if (this.typeDie[i] == charClass.getHitDie() ) {
                this.amountOfDie[i]++;
                break;
            }
        }
    }
}
