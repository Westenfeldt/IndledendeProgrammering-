package Uge2;

import java.util.Scanner;

public class KonveterSekund {
    public static void main(String[] args) {
        int sekundMin, sekundTime, SekundDag, Sekundy;

        sekundMin = 60;
        sekundTime = sekundMin * 60;
        SekundDag = sekundTime * 24;
        Sekundy = SekundDag * 365;

        Scanner scan = new Scanner(System.in);
        int totalsekunder = scan.nextInt();


        int restSeconds = totalsekunder;

        int years = restSeconds / Sekundy;
            restSeconds %= Sekundy;

        int days = restSeconds / SekundDag;
        restSeconds %= SekundDag;

        int hours = restSeconds / sekundTime;
        restSeconds %= sekundTime;

        int minutes = restSeconds / sekundMin;
        restSeconds %= sekundMin;

        System.out.println(totalsekunder + " sekunder, svarer til " + years + "år" +
                days + " døgn, " + hours + " timer, "
                + minutes + " minutter og "
                + restSeconds + " sekunder.");

    }
}
