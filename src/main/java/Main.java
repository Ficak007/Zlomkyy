import cz.uhk.zlomkyy.data.Zlomek;

public class Main {

    public static void main() {
        IO.println("==================Projekt Zlomky==================");
        IO.println("__________________________________________________");

        Zlomek a = new Zlomek();    //konstruktor bez parametru - defaultni konstruktor
        a.setCitatel(1);
        a.setJmenovatel(2);

        var b  = new Zlomek(3,4);   //var odvozuje typ proměnné automaticky

        IO.println(a);
        IO.println(b);
    }
}
