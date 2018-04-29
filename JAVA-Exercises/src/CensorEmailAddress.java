import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CensorEmailAddress {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String theEmail = reader.readLine();
        String[] email = theEmail.split("@");
        String theString = reader.readLine();

        String name = email[0];
        StringBuilder replaced = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            replaced.append("*");
        }

        replaced.append("@");
        replaced.append(email[1]);

        String finalString = theString.replaceAll(theEmail, replaced.toString());

        System.out.println(finalString);
    }
}
