import java.util.Scanner;

public class SumNIntegers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(console.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
