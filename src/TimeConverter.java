import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give days and I will output seconds.");
        int days = scanner.nextInt();
        int seconds =days*24*60*60;
    }
}
