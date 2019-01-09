package Uge1;

public class Skatteberegner{
    public static void main(String[] args){
        int indkomst = 120000;
        double ambi, pension, bundskat, pfradrag;

        pfradrag = 33400;
        ambi = indkomst * 8.0 / 100.0;
        pension = indkomst * 1.0 / 100.0;
        bundskat = (indkomst - ambi - pension - pfradrag) * 7.0 / 100;



        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.println(bundskat);

    }
}
