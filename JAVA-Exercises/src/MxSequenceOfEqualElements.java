import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = 0;
        int length = 1;
        int beststart = 0;
        int bestlength = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                length++;
            } else {
                start = i;
                length = 1;
            }
            if (length > bestlength) {
                bestlength = length;
                beststart = i;
            }
        }

        for (int j = 0; j < bestlength; j++) {

            System.out.print(numbers[beststart] + " ");
        }
    }
}
