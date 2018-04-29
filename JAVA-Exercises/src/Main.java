import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double height = Double.parseDouble(console.nextLine());
        double width = Double.parseDouble(console.nextLine());
        Rectangle currentRect = new Rectangle(height, width);

        System.out.println(currentRect.getWidth());
        System.out.println(currentRect.toString());

    }
}
