import java.util.Arrays;

class DigitExtracter {
    public int[] extract(String text){
        int[] result = new int[0];
        String [] digits = new String []{"1","2","3","4","5","6","7","8","9","0"};
        String [] phrases = text.split("");
        String s = "";

            for (String value : phrases) {
                for (String dig : digits) {
                    if (value.equals(dig)) {
                        s = s + value;
                        //System.out.println(s);
                        result = new int[s.length()];
                    }
                }
            }
                    //System.out.println(s);
                    String [] resultsInString = s.split("");
                    //System.out.println(Arrays.toString(resultsInString));
                    for(int i=0; i<s.length(); i++) {
                        result[i] = Integer.parseInt(resultsInString[i]);




    }
        return result;
    }
}



class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
