import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        double bmi = weight/(Math.pow(height, 2));
        if (bmi <= 18.5) {
            System.out.println("недовес");
        } else if (18.5 < bmi && bmi <= 25) {
            System.out.println("все в норме");
        } else if (25 < bmi && bmi <= 30) {
            System.out.println("лишний вес");
        }
        else {
            System.out.println("ожирение");
        }
    }
}