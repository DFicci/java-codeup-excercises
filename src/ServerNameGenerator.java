import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"funny", "lackadaisical", "prompt", "fastidious", "prickly", "amazing", "incredible", "outdated", "pristine", "comical"};

    public static String[] nouns = {"desk", "guitar", "house", "volkswagen", "lawnmower", "duck", "chair", "poster", "event", "candle"};

    public static String getWord(String[] words){
        Random random = new Random();
        int randomNumber = random.nextInt(words.length);
        return words[randomNumber];
    }

    public static void main(String[] args){
        System.out.println(getWord(adjectives));
        System.out.println(getWord(nouns));
    }


}
