package Triple_Trouble;


public class Triple_Trouble {

    public static void main(String[] args) {

        System.out.println(tripleTrouble("aaa", "bbb", "ccc"));
    }

    public static String tripleTrouble(String one, String two, String three) {

        String grouped = "";

        for(int i = 0; i < one.length(); i++) {

            grouped += one.charAt(i) + two.charAt(i) + three.charAt(i);
        }

        return grouped;
    }

}
