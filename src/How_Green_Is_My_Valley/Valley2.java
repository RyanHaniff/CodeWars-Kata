package How_Green_Is_My_Valley;

import java.util.Arrays;

public class Valley2 {

    public static void main(String[] args) {

        int[] arr1 = {-2, 5, 7, -10, 100, -40, 35, 56};
        int[] arr2 = makeValley(arr1);

        for (int temp : arr2) {
            System.out.print(temp + ", ");
        }

    }

    public static int[] makeValley(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                ans[i / 2] = arr[arr.length - 1 - i];
            else
                ans[arr.length - 1 - i / 2] = arr[arr.length - 1 - i];
        }
        return ans;
    }

}
