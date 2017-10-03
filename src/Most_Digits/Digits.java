package Most_Digits;


public class Digits {

    public static void main(String[] args) {

        int[] arr = {10, 1, 0, 1, -10};

        System.out.println(findLongest(arr));
    }

    public static int findLongest(int[] numbers) {

        int largestValue = 0;
        int mostDigits = 0;

        for (int number : numbers) {
            int digitLength = String.valueOf(Math.abs(number)).length();

            if (digitLength > mostDigits) {
                mostDigits = digitLength;
                largestValue = number;
            }

        }

        return largestValue;

//        public static int findLongest(int[] numbers) {
//            int index = 0;
//            for (int i = 0; i < numbers.length; i++) {
//                if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[index])).length()) {
//                    index = i;
//                }
//            }
//            return numbers[index];
//        }

    }
}
