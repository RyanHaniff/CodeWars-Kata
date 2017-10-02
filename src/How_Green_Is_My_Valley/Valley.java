package How_Green_Is_My_Valley;


public class Valley {

    public static void main(String[] args) {

        int[] array1 = {10, -5, 6, -2, 15, 30, -100};
        int[] array2 = makeValley(array1);
        for (int temp : array2) {
            System.out.print(temp + ", ");
        }

    }

    public static int[] makeValley(int[] arr) {

        int temp;
        for (int i = 1; i < arr.length; i++) { //Start at 1 since value at 0 is already at the leftmost array (sorted)

            //key = arr[i];
            //j = i-1; //We want to compare array index to array on left
            // ex: start at 1 - 0 = 0, So it will compare index 1 to index 0
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        if(arr.length % 2 == 0) {

        }

        return arr;
    }

}
