package Counting_Power_Sets;


import java.math.BigInteger;

public class Powers {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(powers(arr));
    }

    //Power sets: 2^n, where n is the number of members (length of the array)

    public static BigInteger powers(int[] list) {

        BigInteger b = new BigInteger("2");

        return b.pow(list.length);

        //Simplifed version:
        //return BigInteger.valueOf(2).pow(list.length);
    }

}
