package backgroun;

import java.util.Random;

public class DiceRoll {
    public static int rollFour() {
        Random r = new Random();
        return r.nextInt(4) + 1;
    }
    public static int[] rollFour(int times) {
        Random r = new Random();
        int[] num = new int[times];
        for (int i = 0 ; i < times ; i++) {
            num[i] = rollFour();
        }
        return num;
    }


    public static int rollSix() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }

    public static int[] rollSix(int times) {
        Random r = new Random();
        int[] num = new int[times];
        for (int i = 0 ; i < times ; i++) {
            num[i] = rollSix();
        }
        return num;
    }

    public static int rollEight() {
        Random r = new Random();
        return r.nextInt(8) + 1;
    }

    public static int[] rollEight(int times) {
        Random r = new Random();
        int[] num = new int[times];
        for (int i = 0 ; i < times ; i++) {
            num[i] = rollEight();
        }
        return num;
    }

    public static int rollTen() {
        Random r = new Random();
        return r.nextInt(10) + 1;
    }

    public static int[] rollTen(int times) {
        Random r = new Random();
        int[] num = new int[times];
        for (int i = 0 ; i < times ; i++) {
            num[i] = rollTen();
        }
        return num;
    }

    public static int rollTwelve() {
        Random r = new Random();
        return r.nextInt(12) + 1;
    }

    public static int[] rollTwelve(int times) {
        Random r = new Random();
        int[] num = new int[times];
        for (int i = 0 ; i < times ; i++) {
            num[i] = rollTwelve();
        }
        return num;
    }

    public static int rollTwenty() {
        Random r = new Random();
        return r.nextInt(20) + 1;
    }

    public static int[] rollTwenty(int times) {
        Random r = new Random();
        int[] num = new int[times];
        for (int i = 0 ; i < times ; i++) {
            num[i] = rollTwenty();
        }
        return num;
    }

    public static int rollCent() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    public static int[] rollCent(int times) {
        int[] num = new int[times];
        for (int i = 0 ; i < times ; i++) {
            num[i] = rollCent();
        }
        return num;
    }
}
