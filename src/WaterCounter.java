class WaterCounter {

    public double count(String text) {
        String[] letters = text.split("");
        int countSpaces = 0;
        for (String letter : letters){
            if ( letter.equals(" ")){
                countSpaces += 1;
            }
        }
        return countSpaces/(double)text.length();
    }
}


class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}