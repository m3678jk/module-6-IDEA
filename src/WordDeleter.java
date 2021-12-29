class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] phrases;
        phrases = phrase.split(" ");
        String s = "";
                   for (String w: words){
                       for (String value : phrases){
                                 if (!value.equals(w)) {
                                    s = "" + value;


                                         // System.out.println(s);
                                      }
                             }
                   }
        return s.trim();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //lutoekj mynopybi
        System.out.println(wordDeleter.remove("vys ycly zawofu lutoekj mynopybi egces", new String[] {"vys", "zawofu", "ycly", "egces"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}