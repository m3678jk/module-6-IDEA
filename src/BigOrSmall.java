import java.util.Locale;

class BigOrSmall {
    public String calculate(String text) {
        String[] letters = text.split("");
        int countUpperLetter = 0;
        int countLowerLetter = 0;

        for (String letter : letters) {
            if (!letter.equals(letter.toLowerCase(Locale.ROOT))) {
                countUpperLetter += 1;
            } else if (letter.equals(letter.toLowerCase(Locale.ROOT))) {
                countLowerLetter += 1;
            }
        }


        if (countLowerLetter == countUpperLetter) {
            return "Same";
        } else if (countLowerLetter >= countUpperLetter) {
            return "Small";
        } else {
            return "Big";
        }
    }
}


class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}