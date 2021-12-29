class DigitText{
    public boolean detect(String text){
        String [] words = new String []{"1","2","3","4","5","6","7","8","9", " "};

        int count = 0;
        for (String w: words){
            if (!text.contains(w)){
                count += 1;
            }
        }
        return count ==0;
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
