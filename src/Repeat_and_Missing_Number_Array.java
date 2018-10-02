import java.util.*;

public class Repeat_and_Missing_Number_Array {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
    ArrayList<Integer> ArrL = new ArrayList<Integer>();
    long sum_of_values_real = 0, delta_val = 0;
    long sum_of_squares_real = 0, delta_sq = 0;
    Integer mis = 0, dbl = 0;
    long list_len = A.size();
    long sum_of_values = list_len*(list_len+1)/2;
    long sum_of_squares = (list_len*(list_len+1)*(2*list_len+1))/6;
        Iterator<Integer> iter = A.iterator();

        while(iter.hasNext())
        {
            ArrL.add(iter.next());
            System.out.println(iter);
        }
        Collections.sort(ArrL, (a, b) -> a.compareTo(b));
    for(Integer i: A)
    {
        sum_of_values_real = sum_of_values_real + (long)i;
        sum_of_squares_real = sum_of_squares_real + (long)i*(long)i;
            /*sum_of_values -= (long)i;
            sum_of_squares -= ((long)i*(long)i);*/
    }
    delta_val = sum_of_values - sum_of_values_real;  // sum_of_values - A + B = sum_of_values_real;
    delta_sq = sum_of_squares - sum_of_squares_real;
    dbl = (int)((delta_sq/delta_val - delta_val)/2);
    mis = (int) (delta_val+dbl);
    ArrL.add(dbl);
    ArrL.add(mis);
        /*mis = (int)(sum_of_values + sum_of_squares/sum_of_values)/2;
        dbl= mis - (int)sum_of_values;
        ArrL.add(dbl);
        ArrL.add(mis);*/
    return ArrL;
}
    public static void main(String[] args)
    {
        ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(25,1,2,3,5,5));
        Repeat_and_Missing_Number_Array Rep = new Repeat_and_Missing_Number_Array();
        Rep.repeatedNumber(ArrL);
    }
}
