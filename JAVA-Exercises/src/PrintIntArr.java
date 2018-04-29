import java.util.Arrays;

public class PrintIntArr {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers)
                .replaceAll("\\[|]", ""));
    }
}
