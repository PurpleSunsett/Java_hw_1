import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double srar = (a + b) / 2;
        System.out.println(srar);
        System.out.println(Math.sqrt(a * b));
    }
}