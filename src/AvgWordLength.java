import java.util.Arrays;

class AvgWordLength {
    public double count(String phrase){
        String [] phrases= phrase.split(" ");
       // System.out.println(Arrays.toString(phrases));
        double lenthOfWords= 0d;
        for (String phr : phrases){
            lenthOfWords +=phr.length();
        }

        return lenthOfWords/ phrases.length;
    }
}


class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
