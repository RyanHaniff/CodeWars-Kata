package Leonardo_Dicaprio_and_Oscars;


public class Kata {

    public static void main(String[] args) {

        String ans = leo(20);

        System.out.println(ans);

    }

    public static String leo(final int oscar) {

        if (oscar == 88) {
            return "Leo finally won the oscar! Leo is happy";
        } else if (oscar == 86) {
            return "Not even for Wolf of wallstreet?!";
        } else if (oscar > 88) { //The ordering of were you put the else if statements is very important
            return "Leo got one already!";
        } else {
            return "When will you give Leo an Oscar?";
        }


    }

}
