import java.util.Arrays;
import java.util.Scanner;

public class ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine()
                .split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if(!AreSpecial(nums[0], nums[1], nums[2]) &&
                !AreSpecial(nums[1], nums[2], nums[0]) &&
                !AreSpecial(nums[0], nums[2], nums[1])) {
            System.out.println("No");
        }
    }
    static boolean AreSpecial (int num1, int num2, int num3){
        if (!(num1 + num2 == num3)) {
            return false;
        }else {
            if(num1 <= num2) {
                System.out.printf("%d + %d = %d", num1, num2, num3);
                return true;
            }else {
                System.out.printf("%d + %d = %d", num2, num1, num3);
                return true;
            }
        }

    }
}
