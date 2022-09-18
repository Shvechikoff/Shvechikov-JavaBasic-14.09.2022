import java.util.Random;
import java.util.Scanner;

// сообщение -- сканер -- условие+сообщение -- допольнительные условия
public class Main {

    public static void main(String[] args) {

        System.out.println("Write random number from 1 to 6");
        int generateNumber = new Random().nextInt(1, 6);
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == generateNumber) {
            System.out.println("It`s right. You WIN! =)");
        } else {
            System.out.println("Better luck next time, it`s " + generateNumber);
        }
    }
}