package byog.Core;


import java.util.Random;

public class Data {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;
    private static long seed = 0;


    public static Random setGameSeed(String input) {
        seed = 0;
        for (int i = 0; i < input.length(); i += 1) {
            if (Character.isDigit(input.charAt(i))) {
                seed = 10 * seed + Long.parseLong("" + input.charAt(i));
            }
        }
        return new Random(seed);
    }

}