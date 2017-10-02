package Beginner_Series_4_Cockroach;

//1km = 1000m, 1m = 100cm      1000m/1km*100cm/1m =
//1hr = 60min, 1min = 60sec    60min/1hr*60sec/1min

public class Cockroach {


    public static void main(String[] args) {

        double value = 1.09;
        int ans = cockroachSpeed(value);
        System.out.println(ans);

    }

    public static int cockroachSpeed(double speed) {

        int conversionMeters = (1000 / 1) * (100 / 1);
        int conversionSeconds = (60 / 1) * (60 / 1);

        double convert = speed * conversionMeters / conversionSeconds;

        int flooredInt = (int) Math.floor(convert);

        return flooredInt;
    }

}
