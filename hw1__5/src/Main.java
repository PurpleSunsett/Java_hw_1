import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 234 / 7;
        System.out.println(a);
        System.out.println(n / 3600);
        System.out.println((n / 3600 - 1) * 60);
        System.out.println((n / 60 - 1) * 60);
    }
}