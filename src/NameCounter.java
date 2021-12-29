import java.util.Arrays;
import java.util.Locale;

public class NameCounter {

    public int count(String text) {
        int count = 0;
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
                String[] letters = word.split("");
                int countUpperLetter = 0;
            System.out.println(Arrays.toString(letters));

                for (String letter : letters) {
                    if (!letter.equals(letter.toLowerCase(Locale.ROOT))) {
                        countUpperLetter += 1;

                        count += 1;
                        System.out.println(word + " " + countUpperLetter);
                        return countUpperLetter;
                    }
                }
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