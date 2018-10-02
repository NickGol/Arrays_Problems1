import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {
    public ArrayList<Integer> maxset(ArrayList<Integer> A)
    {
        long counter=0, max_cnt=0, el_cnt=0, el_cnt_buf=Long.MIN_VALUE;
        int num = 0, max_f = -1, max_l = -1, cur_f = -1, cur_l = 0;
        ArrayList<Integer> ArrList = new ArrayList<>();
        A.add(-1);

        for(int i=0; i<A.size(); i++) {
            num = A.get(i);
            if( num<0 )
            {
                if(el_cnt>0)
                if( counter>max_cnt || (counter==max_cnt && el_cnt_buf<el_cnt) )
                {
                    max_cnt = counter; max_l = cur_l; max_f = cur_f+1; el_cnt_buf = el_cnt;
                }
                counter = 0; cur_f = i; cur_l = i; el_cnt = 0;
            }
            else if(num>=0) {counter += num; cur_l = i; el_cnt++;}
        }
        if(max_f>=0)
            for(int i=max_f; i<=max_l; i++)
            {
                ArrList.add(A.get(i));
            }
            System.out.println(ArrList.toString());
            return ArrList;
    }

    /*public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
    }*/

    /*public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long max=-1;
        long max1=0;
        int start_index=0,last_index=0,temp=0;
        Integer [] arr=a.toArray(new Integer[a.size()]);
        Integer [] arr1=a.toArray(new Integer[a.size()]);
        int n=a.size();
        for(int i=0;i<n;i++)
        {
            if(i!=0 && arr[i-1]>=0 && arr[i]>=0)
            {
                max1+=arr[i];
                if(i==n-1 && max<max1)
                {
                    max=max1;
                    last_index=i;
                    start_index=temp;
                }else if(i==n-1 && max== max1)
                {
                    int length1=last_index- start_index+1;
                    int lenght2=i-temp+1;
                    if(lenght2>length1)
                    {
                        last_index=i;
                        start_index=temp;
                    }
                }
            }
            else if(arr[i]>=0)
            {
                temp=i;
                max1=arr[i];
                if(i==n-1 && max<max1)
                {
                    max=max1;
                    last_index=i;
                    start_index=temp;
                }
                else if(i==n-1 && max== max1)
                {
                    int length1=last_index- start_index+1;
                    int lenght2=i-temp+1;
                    if(lenght2>length1)
                    {
                        last_index=i;
                        start_index=temp;
                    }
                }
            }
            else if(i!=0 && arr[i]<0 && arr[i-1]>=0)
            {
                if(max<max1){
                    max=max1;
                    max1=0;
                    start_index=temp;
                    last_index=i-1;
                }
                else if(max == max1)
                {
                    max1=0;
                    int length1=last_index- start_index+1;
                    int lenght2=i-1 -temp+1;
                    if(lenght2>length1)
                    {
                        last_index=i-1;
                        start_index=temp;
                    }
                }
            }
        }
        a.clear();
        if(max==-1)
            return a;
        for(int i=start_index;i<=last_index;i++)
        {

            a.add(arr1[i]);
        }

        return a;
    }
*/
    public static void main(String[] args)
    {
        //ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(1, 2, 5, 3, -7, 2, 3, 6));
        ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421));
        MaxNonNegativeSubArray Mnnsa = new MaxNonNegativeSubArray();
        Mnnsa.maxset(ArrL);
    }
}
