package altERnaTIng_cAsE;


public class StringUtils {

    public static void main(String[] args) {
        System.out.print(toAlternativeString("HeLlLlLoooOOOO1234."));
    }

    public static String toAlternativeString(String string) {

        String result = "";
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}
