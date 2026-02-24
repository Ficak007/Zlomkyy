package cz.uhk.merapp.data;

import java.util.ArrayList;
import java.util.List;

public class Mereni {
    //atribut agregace s Number 1:N
    private List <Number> data = new ArrayList<>();

    public void pridejMereni(Number m){
        data.add(m); //delegovani
    }

    public Number get(int index){
        return data.get(index);
    }

    public int pocet() {
        return data.size();
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
        return prumer.doubleValue() / data.size();
    }

    public Number min(){
        Number min = data.getFirst();
        for(var cislo : data){
            if(cislo.doubleValue() < min.doubleValue()){
                min = cislo;
            }
        }
        return min;
    }

    public Number max(){
        Number max = data.getFirst(); // novější get(0) vezeme první prvek v listu
        for(var cislo : data){
            if(cislo.doubleValue() > max.doubleValue()){
                max = cislo;
            }
        }
        return max;
    }
}
