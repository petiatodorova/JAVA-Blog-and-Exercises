import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReadingIntArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine()
                .split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(numbers);

        int count = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (count > 2) {
                break;
            }
            System.out.print(numbers[i] + " ");
            count++;
        }
    }
}
