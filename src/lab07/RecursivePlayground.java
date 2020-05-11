package lab07;

public class RecursivePlayground {

    public static void main(String[] args) {
        int number = 6;
        System.out.println("Fibonacci" + number +"): " + fibonacci(number));
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
        }
}
