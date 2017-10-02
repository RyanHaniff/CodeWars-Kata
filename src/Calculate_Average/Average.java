package Calculate_Average;


public class Average {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1};

        System.out.println(find_average(arr));
    }

    public static double find_average(int[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;

        //this can also be done:
        //return Arrays.stream(array).average().orElse(0);

    }
}
