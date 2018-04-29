import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
        import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine()
                .split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] bomb = Arrays.stream(reader.readLine()
                .split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int theBombNumber = bomb[0];
        int thePower = bomb[1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == theBombNumber) {
                int start = Math.max(i - thePower, 0);
                int end = Math.min(i + thePower, numbers.length - 1);
                for (int j = start; j <= end; j++) {
                    numbers[j] = 0;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }
}
