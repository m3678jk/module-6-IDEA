import java.util.Locale;

class WordCombine {

    public boolean canCombine(String sourceWord, String targetWord){

        // both word to lower case
        sourceWord = sourceWord.toLowerCase(Locale.ROOT);
        targetWord = targetWord.toLowerCase(Locale.ROOT);


        // create two arrays
        String[] sourceLetters = sourceWord.split("");
        String[] targetLetters = targetWord.split("");

        // count how many times letters from source world appears in target word
        int count = 0;

             for (String tarLet : targetLetters) {
                  for (String sourLet : sourceLetters) {
                        if (targetWord.contains(sourLet)) {
                            //System.out.println(sour + count);
                            count += 1;

                        }

            }
        }
        // just feel that count should be greater than length of target word
        return count >= targetWord.length();
    }
}


class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
