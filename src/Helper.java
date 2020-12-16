import java.util.Random;

public class Helper {


    public static int getRandomAge() {
        int min = 1;
        int max = 12;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;

        return rand;
    }
    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();

    }

}
