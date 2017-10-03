package Name_Array_Capping;


public class Array_Capping {

    public static void main(String[] args) {

        String[] arr = {"hello", "ryan"};

        capMe(arr);
    }

    public static String[] capMe(String[] strings) {

        for(String a : strings) {

            char[] test = a.toCharArray();
            char b = Character.toUpperCase(test[0]);

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < test.length; i++){
                sb.append(test[i]);
            }
            System.out.println(sb);
        }

        return null;

    }
}
