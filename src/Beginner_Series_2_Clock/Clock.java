package Beginner_Series_2_Clock;

//1hr = 60min, 1min = 60sec, 1sec = 1000milisec
//(60min/1hr)*(60sec/1min)*(1000milisec/1sec)

public class Clock {

    public static void main(String[] args) {

        int time = Past(0,1,1);
        System.out.println(time);

    }

    public static int Past(int h, int m, int s) {
        int hours = h * (60 / 1) * (60 / 1) * (1000 / 1);
        int minutes = m * (60 / 1) * (1000 / 1);
        int seconds = s * (1000 / 1);

        int timeInMiliSec = hours + minutes + seconds;

        return timeInMiliSec;
    }

}
