import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine()
                .split("[ ]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int index = 0;
        boolean existIndex = false;

        for (int i = 0; i < numbers.length; i++) {

            //left sum
            int leftSum = 0;
            if (i == 0) {
                leftSum = 0;
            } else {
                for (int j = 0; j <= i - 1; j++) {
                    leftSum += numbers[j];
                }
            }

            //right sum
            int rightSum = 0;
            if (i == numbers.length - 1) {
                rightSum = 0;
            } else {
                for (int m = i + 1; m < numbers.length; m++) {
                    rightSum += numbers[m];
                }
            }

            if (leftSum == rightSum){
                index = i;
                existIndex = true;
            }
        }

        if (existIndex) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
