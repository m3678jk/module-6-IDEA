class MathDetector {
    public boolean isMath(String text){
        String [] digits = new String []{"1","2","3","4","5","6","7","8","9" };
        int count = 0;
        for (String digit: digits){
            if (!text.contains(digit)){
                count += 1;
            }
        }
        String [] symbols = new String []{"+","-","/","*" };
        int countSymbols = 0;
        for (String symbol: symbols){
            if (!text.contains(symbol)){
                countSymbols += 1;
            }
        }

        return count >=2 &&text.contains("=") && countSymbols >=1;

    }

}
class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}