import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Base10 and I will output binary.");
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
    }
}
class Converter {
    static String toBinary(int num){
        String binary = "";
        while (num > 0) {
            binary = (num%2) + binary;
            num /= 2;
        }
        return binary;
    }
}