package cz.uhk.zlomkyy.data;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {} // defaultni konstruktor

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

    @Override
    public String toString() {
        return String.format("%4d\n-------\n%4d",citatel,jmenovatel);
    }
}
