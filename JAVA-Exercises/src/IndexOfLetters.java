import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();

        for (int i = 0; i < word.length(); i++) {
            int currentIndex = (int) word.charAt(i) - 97;
            System.out.println(word.charAt(i) + " -> " + currentIndex);
        }
    }
}
