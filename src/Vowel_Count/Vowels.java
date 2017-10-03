package Vowel_Count;

public class Vowels {

    public static void main(String[] args) {

        System.out.println(getCount("aaaeigflo"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;

        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {
                case 'a':
                    vowelsCount++;
                    break;

                case 'e':
                    vowelsCount++;
                    break;

                case 'i':
                    vowelsCount++;
                    break;

                case 'o':
                    vowelsCount++;
                    break;

                case 'u':
                    vowelsCount++;
                    break;
            }
        }
        return vowelsCount;

        //simplified version
        //return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

}
