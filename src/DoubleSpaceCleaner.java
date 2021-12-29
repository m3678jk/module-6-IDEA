class DoubleSpaceCleaner{
    private String phrase;

    public String clean(String phrase) {

        while (phrase.contains("  ")) {
            String phraseD = phrase.replace("  ", " ");
            phrase = phraseD;
            //System.out.println(phrase + phraseD);
        } return phrase.trim();
    }
}


class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
