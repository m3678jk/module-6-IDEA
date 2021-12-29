import java.util.Arrays;

class Phrase {
    private final String[] words;

    public Phrase(String[] words){
        // each element in array in this case is not immutable
                this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString(){
        //divided ", ". in the task was "space"
        String result = "";

        for (String wor :Arrays.copyOf(words, words.length)){
            result = result + wor + ", ";
        }
        //System.out.println(result);

        return result.substring(0, result.length()-2);
    }
}




class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}