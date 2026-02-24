package cz.uhk.merapp;


import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomkyy.data.Zlomek;

public class MereniApp {

    public static void main(String[] args) {
        var mereni = new Mereni();

        mereni.pridejMereni(new Zlomek(1,2));
        mereni.pridejMereni(new Zlomek(5,4));
        mereni.pridejMereni(new Zlomek(2,7));
        mereni.pridejMereni(new Zlomek(3,8));
        mereni.pridejMereni(new Zlomek(7,6));


        mereni.pridejMereni(23);
        mereni.pridejMereni(16.3);
        mereni.pridejMereni(47.25);
        mereni.pridejMereni(35E2);
        mereni.pridejMereni(24.8f);

        for (int i = 0; i < mereni.pocet(); i++){
            IO.println(mereni.get(i));
        }

        IO.println("Soucet je: %g".formatted(mereni.soucet().doubleValue()));
        IO.println("Prumer je: %g".formatted(mereni.prumer().doubleValue()));
        IO.println("Minimum je: %g".formatted(mereni.min().doubleValue()));
        IO.println("Maximum je: %g".formatted(mereni.max().doubleValue()));


    }
}
