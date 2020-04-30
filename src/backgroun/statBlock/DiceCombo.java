package backgroun.statBlock;


import java.util.Arrays;

public class DiceCombo {
    //returns three largest rolls
    public static int[] discardLowest (int[] roll) {
        Arrays.sort(roll);
        int[] num = new int[roll.length - 1];
        for (int i = 1 ; i < roll.length ; i++) {
            num[i - 1] = roll[i];
        }
        return num;
    }
    // sums the three largest rolls
    public static int discardLowest (int[] roll,boolean sumOf) {
        if (sumOf) {
        Arrays.sort(roll);
        int num = 0;
        for (int i = 1 ; i < roll.length ; i++) {
            num = num + roll[i];
        }
        return num; } else {
            return 0; }

    }

}
