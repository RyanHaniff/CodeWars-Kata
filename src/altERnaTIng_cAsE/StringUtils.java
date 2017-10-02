package altERnaTIng_cAsE;


public class StringUtils {

    public static void main(String[] args) {
        System.out.print(toAlternativeString("HeLlLlLoooOOOO1234."));
    }

    public static String toAlternativeString(String string) {

        char[] charArray = string.toCharArray();

        String modifiedString = "";

        for(int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isUpperCase(ch)) {
                modifiedString = modifiedString + Character.toLowerCase(ch);

            } else {
                modifiedString = modifiedString + Character.toUpperCase(ch);
            }
        }


        return modifiedString;
    }
}
