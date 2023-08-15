import java.util.Random;

public class Dice {

    public static void main(String[] args) {
        Random newNumber = new Random();
        int x = newNumber.nextInt(6) + 1;
        System.out.println("you rolled a " + x);
    }
}