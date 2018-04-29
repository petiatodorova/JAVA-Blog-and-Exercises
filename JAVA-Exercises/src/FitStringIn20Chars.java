import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FitStringIn20Chars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String theString = reader.readLine();
        int length = theString.length();

        if (length < 20) {
            System.out.print(theString);
            for (int i = length + 1; i <= 20; i++) {
                System.out.print("*");
            }
        } else {
                System.out.print(theString.substring(0, 20));
        }
    }
}
