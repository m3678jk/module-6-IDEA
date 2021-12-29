class WordDeleter {
    public String remove(String phrase, String[] words) {

        String s = " " + phrase + " ";
        String k = "";

        for (String w: words){

            String m = " " + w;
            s = s.replace(m, "") ;
        }


        // System.out.println(s);


        return s.trim();
    }

}
class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();



        //matajilyh objiqono
        System.out.println(wordDeleter.remove("potou vys matajilyh objiqono zawofu egces", new String[] {"zawofu", "egces", "potou", "vys" }));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
