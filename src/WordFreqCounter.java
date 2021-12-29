import java.util.Arrays;
import java.util.Locale;

class WordFreqCounter {


    public float countFreq(String phrase, String word){
        String [] result;
        phrase = phrase.toLowerCase(Locale.ROOT);
        result = phrase.split(" ");
        word = word.toLowerCase(Locale.ROOT);

        //System.out.println(Arrays.toString(result));
        float count= 0 ;
        for (String r : result){
            if (r.equals(word)){
                count += 1f;
               // System.out.println(count);
            }
        }return count/ (float)result.length;

    }

}


class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0.23076923191547394
        System.out.println(freqCounter.countFreq("kohufaygnak lyjazavekez meyjciriom Cydigygide oggeet afiksuu wixi Cydigygide nix ixvep Cydigygide goleasn xom", "cydigygide"));
    }
}