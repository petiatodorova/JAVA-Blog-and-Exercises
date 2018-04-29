import java.util.Scanner;

public class DecimalToHexAndBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.println(Integer.toHexString(n).toUpperCase());
        System.out.println(Integer.toBinaryString(n));
    }
}
