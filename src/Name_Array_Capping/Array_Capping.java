package Name_Array_Capping;


public class Array_Capping {

    public static void main(String[] args) {

        String[] arr = {"heLLo", "ryan"};

        System.out.println(capMe(arr));
    }

    public static String[] capMe(String[] strings) {

        StringBuilder sb = new StringBuilder();
        for (String word : strings) { //looping through string array a = 0 we are at hello

//            char[] charArray = word.toCharArray();
//            char b = Character.toUpperCase(charArray[0]);

            sb.append(Character.toUpperCase(word.charAt(0)));
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    sb.append(Character.toLowerCase(word.charAt(i)));
                } else {
                    sb.append(word.charAt(i));
                }

                strings[i - 1] = sb.toString();
            }


        }

        return strings;
    }
}
