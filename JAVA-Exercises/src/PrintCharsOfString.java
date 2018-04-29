public class PrintCharsOfString {
    public static void main(String[] args) {
        String str = "SoftUni";

        for (int i = 0; i < str.length(); i++) {
            System.out.printf("str[%d] = %s%n", i, str.charAt(i));
        }
    }
}
