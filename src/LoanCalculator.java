import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 0; i < 6; i++) {
            amount *= 0.9;
        }
        System.out.println(amount);
    }
}
