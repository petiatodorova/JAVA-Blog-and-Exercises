import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] helper = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int length = 1;
            int j = i;
            while (j < helper.length - 1){
                if (numbers[j] < numbers[j + 1]) {
                    length++;
                } else {
                    break;
                }
                j++;
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

        for (int ind = index; ind < maxLength + index; ind++) {
            System.out.print(numbers[ind] + " ");
        }
    }
}
