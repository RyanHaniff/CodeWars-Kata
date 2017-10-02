package Counting_Power_Sets;


public class Powers {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(powers(arr));
    }

    //Power sets: 2^n, where n is the number of members (length of the array)

    public static double powers(int[] list) {


        return Math.pow(2, list.length);
    }

}
