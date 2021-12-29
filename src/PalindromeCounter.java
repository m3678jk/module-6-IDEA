import java.util.Arrays;
import java.util.Locale;

class PalindromeCounter {

    public int count(String phrase) {
        int mySum = 0;
        phrase = phrase.toLowerCase(Locale.ROOT);
        String[] result = phrase.split(" ");
       // System.out.println(Arrays.toString(result));


        String[] resultRevers = new String[result.length];   // create new array for reverse words
        for (int i = 0; i < result.length; i++) {
            StringBuilder resultRev = new StringBuilder(result[i]);
            String finalWorld = resultRev.reverse().toString(); // reverse word and convert StringBuilder to String
            resultRevers[i] = finalWorld; // assign elements to array resultRevers
            //System.out.println(Arrays.toString(resultRevers));
        } // two different loop
            for (int r = 0; r < result.length; r++) {
                    if (result[r].equals(resultRevers[r])) {  // if elements from 1st ar. is the same as elements from 2nd ar.
                        mySum += 1;
                        //System.out.println(mySum);
                    }

        } return mySum;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}