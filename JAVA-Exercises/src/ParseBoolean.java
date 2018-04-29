import java.util.Scanner;

public class ParseBoolean {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        boolean bool = Boolean.parseBoolean(str);
        if (bool) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
