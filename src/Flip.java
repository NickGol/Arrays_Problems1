import java.util.ArrayList;

public class Flip {

    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> ArrL = new ArrayList<>();
        long counter = 0, max_f = 0, max_l = 0, cur_f = 0, cur_l = 1, max_cnt=0;
        for(int i=1; i<=A.length(); i++)
        {
            int ch = A.codePointAt(i-1);
            if(ch == 48)
            {
                counter++;
                cur_l = i;
            }
            else counter--;
            if(counter<0)
                { counter = 0; cur_f = i; cur_l = i;}
            if(counter > max_cnt)
                {max_cnt = counter; max_f = cur_f+1; max_l = cur_l;}
        }
        System.out.println(max_f);
        System.out.println(max_l);
        if(max_cnt == 0) return ArrL;
        else ArrL.add((int)(max_f)); ArrL.add((int)(max_l));
            return ArrL;
    }
    public static void main(String [] args)
    {
        Flip f = new Flip();
        f.flip("001111111000000001110011110011000000000000000000000000000000000000000000001");
    }
}
