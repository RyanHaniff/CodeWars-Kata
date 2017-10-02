package Sentence_Smash;


public class SmashWords {

    public static void main(String[] args) {
        String[] randomWords = {"hello", "my", "name", "is", "Ryan"};
        System.out.print(smash(randomWords));

    }


    public static String smash(String... words) {

        return String.join(" ", words);

    }
}
