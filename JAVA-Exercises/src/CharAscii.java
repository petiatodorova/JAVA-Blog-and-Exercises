public class CharAscii {
    public static void main(String[] args) {
        char letter = 'a';
        char letter1 = 'z';
        System.out.println((int) letter);
        System.out.println((int) letter1);
        //Prints from a to z
        for (int i = 97; i <= 122; i++) {
            System.out.println(((char) i));
            
        }
    }
}
