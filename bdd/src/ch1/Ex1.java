package ch1;

public class Ex1 {

    public double MaxIt(Double[] a){

        if(a.length == 0){
            return 0;
        }else if(a.length == 1){
            return a[0];
        }

        Double max = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }


}
