import cz.uhk.zlomkyy.data.Zlomek;

public class Main {

    public static void main() {
        IO.println("==================Projekt Zlomky==================");
        IO.println("__________________________________________________");

        Zlomek a = new Zlomek();    //konstruktor bez parametru - defaultni konstruktor
        a.setCitatel(1);
        a.setJmenovatel(2);

        var b  = new Zlomek(3,4);   //var odvozuje typ proměnné automaticky

        IO.print(a);
        IO.println();
        IO.print(b);
        IO.println();

        IO.println("Součet je %s".formatted(a.plus(b).zkratit()));
        IO.println("Rozdíl je %s".formatted(a.minus(b).zkratit()));
        IO.println("Soucin je %s".formatted(a.krat(b).zkratit()));
        IO.println("Podíl je %s".formatted(a.deleno(b).zkratit()));

        Zlomek[] pole = new Zlomek[]{
                new Zlomek(1,3),
                new Zlomek(1,2),
                new Zlomek(6,5),
                new Zlomek(4,3),
                new Zlomek(7,8),
                new Zlomek(13,10),
        };

        Zlomek vysl = prumer(pole);
        IO.println("aritmetický průměr je: %s".formatted(vysl.zkratit()));
    }

    private static Zlomek prumer(Zlomek[] pole) {

        var soucet  = new Zlomek();//0

        for (var z : pole) {
            soucet = soucet.plus(z);
        }
        var pocet = new Zlomek(pole.length,1);

        return soucet.deleno(pole.length);

    }
}
