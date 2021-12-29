import java.util.Arrays;
import java.util.Locale;

class UniqueCharCounter {

    public int count(String phrase) {
        int sum = 0;
        //phrase = phrase.toLowerCase(Locale.ROOT);
        String[] letters = phrase.split("");
        // String[] letters = new String[phrase.length()];  //do the same job as [phrase.split("")]
//        for (int i = 0; i < phrase.length(); i++)
//            letters[i] = String.valueOf(phrase.charAt(i));
        //System.out.println(Arrays.toString(letters));

        StringBuilder uniqLetter = new StringBuilder();
        for (int j = 0; j < letters.length; j++) {
            if (!uniqLetter.toString().contains(letters[j])) {
                    uniqLetter.append(letters[j]);
                }
        }return uniqLetter.length();
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //8
        System.out.println(charCounter.count("I7 Q35oi"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
