package Sentence_Smash;


public class SmashWords {

    public static void main(String[] args) {
        String[] randomWords = {"hello", "my", "name", "is", "Ryan"};
        System.out.print(smash(randomWords));

    }


    public static String smash(String... words) {

        String join = "";

        for (int i = 0; i < words.length; i++) {
            join = join + words[i];
            if (i != words.length - 1) {
                join = join + " ";
            }

        }

        //Or you can do this:
        //return String.join(" ", words);

        return join;

    }
}
