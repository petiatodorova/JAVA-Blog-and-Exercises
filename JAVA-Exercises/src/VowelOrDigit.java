import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char symbol = console.nextLine().toLowerCase().charAt(0);
        if (Character.isDigit(symbol)) {
            System.out.println("digit");
        } else if (symbol == 'a' || symbol == 'o'
                || symbol == 'e' || symbol == 'i'
                || symbol == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }
}
