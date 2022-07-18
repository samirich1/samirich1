import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(1, 20);
        if (age < 19 && age > 9) {
            System.out.println("Yes.");
        } else {
            System.out.println("no.");
        }
    }
}