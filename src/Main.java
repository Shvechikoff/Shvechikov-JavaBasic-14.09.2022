import java.util.Scanner;

// сообщение -- сканер -- условие+сообщение -- допольнительные условия
public class Main {

    public static void main(String[] args) {

        System.out.println("Write random number from 1 to 6");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 4) {
            System.out.println("It`s right. You WIN! =)");
        } else {
            System.out.println("Better luck next time, its 4 =(");
        }

    }
}