import java.util.Arrays;

class EmailDetector {
    public boolean isPresent(String text) {
        String [] words = text.split(" ");
        //System.out.println(Arrays.toString(words));

        //String [] allBannedSigh = {"@ "," @", "@  ", "  @"};
        int countBannedSigh = 0;
        if (text.contains("@")) {
           for( String word : words ){
               if ( word.contains("@") && word.length()>=5 ){
                   //System.out.println(word);
                   return true;
               }
           }

        }
        return false;

    }
}
class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("bog du r@yv xum paij laqug"));
    }
}