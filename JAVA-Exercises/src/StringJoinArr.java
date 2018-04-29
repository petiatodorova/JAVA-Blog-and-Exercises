public class StringJoinArr {
    public static void main(String[] args) {
        String langs = "Soft Uni Ala Bala, My; Tvoj";
        String[] allLangs = langs.split("[, ;]+");
        for (String lang:allLangs) {
            System.out.println(lang);

        }
        System.out.println(String.join("::", allLangs));
    }
}
