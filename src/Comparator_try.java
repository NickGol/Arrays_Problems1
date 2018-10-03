import java.nio.ByteBuffer;
import java.util.*;
/*
public class Comparator_try implements Comparator<Integer>
{
                public int compare(Integer o1, Integer o2) {
                    String s1 = o1.toString();
                    String s2 = o2.toString();
                    while (s1.length() < s2.length()) {
                        s1 = s1.concat(s1.substring(0, 1));
                    }
                    while (s1.length() > s2.length()) {
                        s2 = s2.concat(s2.substring(0, 1));
                    }

                    int iii = s2.compareTo(s1);
                    return iii;
                }

                public String largestNumber(final List<Integer> A)
                {
                    String str = new String();
                    Collections.sort(A, new Comparator_try());
                    for(Integer num:A)
                    {
                        str = str.concat(num.toString());
                    }
                    System.out.println(str);
                    return str;
                }
*/

/*class comp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int flag = 0;
        while (s1.length() < s2.length()) {
            s1 = s1.concat(s2.substring(0, 1));
            flag = 1;
        }
        while (s1.length() > s2.length()) {
            s2 = s2.concat(s1.substring(0, 1));
            flag = 2;
        }

        int iii = s2.compareTo(s1);
        if(iii==0 && flag ==1)
            iii=1;
        else if(iii==0 && flag ==2)
            iii=-1;
        return iii;
    }
};*/
class comp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2)
    {
        int iii = (o1.toString()+o2.toString()).compareTo(o2.toString()+o1.toString());
        return iii;
    }
};
public class Comparator_try {
        public String largestNumber(final List<Integer> A)
        {
            String str = new String();
            Collections.sort(A, new comp());
            if(A.get(0)==0)
                return "0";
            for(Integer num:A)
            {
                str = str.concat(num.toString());
            }
            // 94 949
            // 12 121
            System.out.println(str);
            return str;
        }
        public static void main(String[] args)
        {
            //ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905));
            ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(12, 121));
            //ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(94, 949));
            ArrayList<String> ArrL1 = new ArrayList<>(Arrays.asList("3", "30", "34", "5", "9"));
            Comparator_try Rep = new Comparator_try();
            ArrL1.sort((a, b) -> b.compareTo(a));
            //ArrL.sort(Rep.compare(a,b));
            //Collections.sort(ArrL, new Comparator_try());//укуцкуцкуцк
            Rep.largestNumber(ArrL);
            int a=0;
        }
    }
