package cz.uhk.zlomkyy.data;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {
        citatel = 0;
        jmenovatel = 1;
    } // defaultni konstruktor

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    //selektory = gettry
    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    //modifikátory = settry
    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    //operace

    /**
     * Scita zlomek s dalším zlomkem
      * @param druhy druhý zlomek s kterým se sčítá
     * @return výsledný zlomek
     */
    public Zlomek plus(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel + druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;

        return new Zlomek(cit, jm);
    }

    public Zlomek minus(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel - druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;

        return new Zlomek(cit, jm);
    }

    public Zlomek krat(Zlomek druhy) {
        int cit = citatel * druhy.citatel;
        int jm = jmenovatel * druhy.jmenovatel;

        return new Zlomek(cit, jm);
    }

    public Zlomek deleno(Zlomek druhy) {
        int pom = druhy.citatel;
        druhy.citatel = druhy.jmenovatel;
        druhy.jmenovatel = pom;

        int cit = citatel * druhy.citatel;
        int jm = jmenovatel * druhy.jmenovatel;

        return new Zlomek(cit, jm);
    }

    public Zlomek deleno(int num) {
        return deleno(new Zlomek(num,1));
    }

    public Zlomek zkratit(){
        var delitel = nsd(citatel, jmenovatel);
        return new Zlomek(citatel / delitel, jmenovatel / delitel);
    }

    private int nsd(int a, int b){
        if(a < b){
            int pom = a;
            a = b;
            b = pom;
        }
        int zb;
        do{
            zb = a % b;
            a = b;
            b = zb;

        }while( zb != 0 );

        return a;
    }



    @Override
    public String toString() {
        return String.format(citatel +"/"+jmenovatel);
    }



}
