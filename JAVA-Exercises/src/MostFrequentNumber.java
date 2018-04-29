import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MostFrequentNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] helper = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int length = 1;
            for (int j = i + 1; j < helper.length; j++) {
                if (numbers[i] == numbers[j]) {
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
        System.out.printf("The number %d is the most frequent (occurs %d times)", numbers[index], maxLength);
    }
}
