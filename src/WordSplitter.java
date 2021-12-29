import java.util.Arrays;
import java.util.Locale;

class WordSplitter {
         private String phrase;


    public String[] split(String phrase){
        String [] result = new String[0];
        // make words in lower case
        phrase = phrase.toLowerCase(Locale.ROOT);

        // rid of unnecessary spaces
        while ( phrase.contains("  ")){
        String phraseD = phrase.replace("  ", " ");
        phrase = phraseD;
        }

        result = phrase.split(" ");

        return result;

    }
}


class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}