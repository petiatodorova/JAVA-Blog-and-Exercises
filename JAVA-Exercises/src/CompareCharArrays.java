import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CompareCharArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input1 = reader.readLine();
        String input2 = reader.readLine();
        String[] splitted1 = input1.split("[ ]+");
        String[] splitted2 = input2.split("[ ]+");
        int minLength = Math.min(splitted1.length, splitted2.length);

        for (int i = 0; i < minLength; i++) {
            if (splitted1[i].compareTo(splitted2[i]) < 0) {
                System.out.println(String.join("", splitted1));
                System.out.println(String.join("", splitted2));
                return;
            } else if (splitted1[i].compareTo(splitted2[i]) > 0) {
                System.out.println(String.join("", splitted2));
                System.out.println(String.join("", splitted1));
                return;
            }
        }

        if (splitted1.length <= splitted2.length){
            System.out.println(String.join("", splitted1));
            System.out.println(String.join("", splitted2));
        } else {
            System.out.println(String.join("", splitted2));
            System.out.println(String.join("", splitted1));
        };
    }
}
