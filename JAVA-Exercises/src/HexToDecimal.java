import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine(), 16);
        System.out.println(n);
    }
}
