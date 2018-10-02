import java.util.ArrayList;
import java.util.Arrays;

public class TripletWithSumBetweenGivenRange {

    public int solve(ArrayList<String> A) {
        if(A.size() < 3) return 0;

        double a = Double.parseDouble(A.get(0));
        double b = Double.parseDouble(A.get(1));
        double c = Double.parseDouble(A.get(2));

        for(int i = 3; i < A.size(); i++){

            if((a+b+c) > 1 && (a+b+c) < 2){
                return 1;
            }


            double n = Double.parseDouble(A.get(i));


            if((a+b+c) >= 2){
                if(a > b && a > c){
                    a = n;
                } else if( b > c){
                    b = n;
                } else{
                    c = n;
                }
            } else{
                if(a < b && a < c){
                    a = n;
                } else if( b < c){
                    b = n;
                } else{
                    c = n;
                }
            }
        }

        System.out.println(a+b+c);
        if((a+b+c) > 1 && (a+b+c) < 2){
            System.out.println(1);
            return 1;
        }
        System.out.println(0);
        return 0;
    }

    public static void main(String[] args)
    {

        ArrayList<String> ArrL = new ArrayList<>(Arrays.asList("1.5", "0.3", "0.3", "0.1", "0.1", "0.1", "0.1", "0.1", "0.1" , "0.1"));
        TripletWithSumBetweenGivenRange TWSBGR = new TripletWithSumBetweenGivenRange();
        TWSBGR.solve(ArrL);
    }
}
