package cz.uhk.merapp.data;

import cz.uhk.util.Seznam;
import cz.uhk.util.impl.SpojovySeznam;

import java.util.ArrayList;
import java.util.List;

public class Mereni {
    //atribut agregace s Number 1:N
    private Seznam<Number> data = new SpojovySeznam<>();

    public void pridejMereni(Number m){
        data.pridej(m); //delegovani
    }

    public Number get(int index){
        return data.vrat(index);
    }

    public int pocet() {
        return data.pocet();
    }

    public Number soucet(){
        Number soucet = 0;
        for(var cislo : data){
            soucet = soucet.doubleValue() + cislo.doubleValue();
        }
        return soucet;
    }

    public Number prumer(){
        Number prumer = 0;
        for(var cislo : data){
            prumer = prumer.doubleValue() + cislo.doubleValue();
        }
        return prumer.doubleValue() / data.pocet();
    }

    public Number min(){
        Number min = data.vrat(0);
        for(var cislo : data){
            if(cislo.doubleValue() < min.doubleValue()){
                min = cislo;
            }
        }
        return min;
    }

    public Number max(){
        Number max = data.vrat(0); // novější get(0) vezeme první prvek v listu
        for(var cislo : data){
            if(cislo.doubleValue() > max.doubleValue()){
                max = cislo;
            }
        }
        return max;
    }
}
