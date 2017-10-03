package Name_Array_Capping;

import java.util.Arrays;

public class Array_Capping {

    public static void main(String[] args) {

        String[] arr = {"heLLo", "ryan"};

        String[] str = capMe(arr);

        System.out.println(Arrays.toString(str));


    }

    public static String[] capMe(String[] strings) {

        int j = 0;

        StringBuilder sb = new StringBuilder();
        String[] str = new String[strings.length];
        while (j < strings.length) {
            for (String word : strings) { //looping through string array a = 0 we are at hello

                for (int i = 0; i < word.length(); i++) {
                    if (i == 0) {
                        sb.append(Character.toUpperCase(word.charAt(i)));
                    } else if (Character.isUpperCase(word.charAt(i))) {
                        sb.append(Character.toLowerCase(word.charAt(i)));
                    } else {
                        sb.append(word.charAt(i));
                    }


                }

                str[j] = sb.toString();
                sb.setLength(0);
                j++;

            }

        }

        return str;
    }
}
