import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double t = scanner.nextDouble();
        Double F = t * 1.8 + 32;
        Double K = t - 273.15;
        System.out.println(F);
        System.out.println(K);
    }
}