import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();
        char[] fromNumber = number.toCharArray();

        String reversed = "";

        for (int i = fromNumber.length - 1; i >= 0 ; i--) {
            reversed = reversed + fromNumber[i];
        }

    }
}
