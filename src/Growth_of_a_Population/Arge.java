package Growth_of_a_Population;

//In a small town the population is p0=1000at the beginning of a year.The population regularly increases
// by 2percent per year and moreover 50new inhabitants per year come to live in the town.How many years
// does the town need to see its population greater or equal to p=1200inhabitants?

public class Arge {

    public static void main(String[] args) {
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }

    //p0 = initial number of inhabitants
    //percent = percentage of growth per year
    //aug = inhabitants coming or leaving each year
    // p = population to surpass

    public static int nbYear(int p0, double percent, int aug, int p) {

        int year = 1;

        int value = p0 + (int)(p0 * (percent / 100) + aug);

        for (int i = 0; value < p; i++) {


            value += (int)(value * (percent / 100)) + aug;
            year++;

        }

        return year;
    }

}
