package book.ch1;

public class Ex1 {

    public double MaxIt(){
        Double[] a = {1.0,2.0,3.0,4.0,5.0};
        Double max = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > max) max = a[i];
        }

        return max;
    }


}
