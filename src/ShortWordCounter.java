import java.util.Locale;

class ShortWordCounter {

    public int count(String phrase, int minLength){
        int mySum = 0;
        String [] result;
        result = phrase.split(" ");

        for (String r : result){
            if ( r.length() <= minLength){
                mySum +=1;
            }
        }
        return mySum;
    }

}


class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}