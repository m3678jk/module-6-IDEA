import java.util.Arrays;

class PunctuationMarkCounter {
    private String phrase;



    public int count(String phrase){
        int result= 0;
        String[] letters = new String[phrase.length()];
        for (int i = 0; i < phrase.length(); i++)
            letters[i] = String.valueOf(phrase.charAt(i));
        //System.out.println(Arrays.toString(letters));

        for (String let: letters){
            if (let.equals(",")||let.equals(".")||let.equals(":")||let.equals(";")||let.equals("!")){
                result +=1;
            }


        }
        return result;
    }
}


class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
