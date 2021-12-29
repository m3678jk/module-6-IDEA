import java.util.Arrays;
import java.util.Locale;

public class NameCounter {

    public int count(String text) {
        int count = 0;

        String[] words = text.split(" ");
        System.out.println( "lenth" + words.length);
        int countUpperLetter = 0;

            for (String word : words) {
                if (!word.equals(word.toLowerCase(Locale.ROOT))) {
                    countUpperLetter += 1;

                }
            }

                if (countUpperLetter!=words.length){
                     count = countUpperLetter;

        }
        return count;
    }
}
class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}