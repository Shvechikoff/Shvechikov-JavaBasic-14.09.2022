public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int c = 14;
// V = a (length) * b (width) * c (height)
        int volume = a * b * c;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        int length = 4 * a + 4 * b + 4 * c;
        System.out.println("Сума сторін паралелепіпеда = " + length);
    }
}