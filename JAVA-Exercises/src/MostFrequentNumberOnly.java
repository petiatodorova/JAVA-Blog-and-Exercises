import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumberOnly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] nums = Arrays.stream(console.nextLine().split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] helper = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int length = 1;
            for (int j = i + 1; j < helper.length; j++) {
                if (nums[i] == nums[j]) {
                    length++;
                }
            }
            helper[i] = length;
        }

        int maxLength = -1;
        int index = 0;

        for (int m = 0; m < helper.length; m++) {
            if (helper[m] > maxLength) {
                maxLength = helper[m];
                index = m;
            }
        }
        System.out.print(nums[index]);
    }
}
