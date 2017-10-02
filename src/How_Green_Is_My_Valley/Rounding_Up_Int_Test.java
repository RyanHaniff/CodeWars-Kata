package How_Green_Is_My_Valley;


public class Rounding_Up_Int_Test {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;

        double value = 9 / 2; //Truncation towards zero because the dividend and divisor are ints (do not have decimals)
                              //The resulting value will be an int and not a double, you would either have to type cast or dividend or divisor must have a decimal place

        System.out.println( value);

    }

}
