import java.util.ArrayList;
import java.lang.reflect.Field;

public class Check_ArrayList {
    static ArrayList<Integer> AL = new ArrayList<>();
    void AddElem(ArrayList<Integer> A) throws Exception
    {
        System.out.println(AL.size());
        //System.out.format("Size: %2d, Capacity: %2d%n", AL.size(), getCapacity(AL));
        AL.add(55);
       // System.out.format("Size: %2d, Capacity: %2d%n", AL.size(), getCapacity(AL));
        AL.add(56);
        AL.add(57);
        AL.add(58);
        AL.add(59);
        AL.add(60);
        AL.add(61);
        AL.add(62);
        AL.add(63);
        AL.add(64);
        //System.out.format("Size: %2d, Capacity: %2d%n", AL.size(), getCapacity(AL));
        AL.add(65);
        //System.out.format("Size: %2d, Capacity: %2d%n", AL.size(), getCapacity(AL));
        AL.add(3,55);
        //System.out.format("Size: %2d, Capacity: %2d%n", AL.size(), getCapacity(AL));
        System.out.println(AL.size());
        Object [] arr = {};
        //arr = AL.toArray(new Integer[AL.size()]);
        arr = AL.toArray();
    }
    public static void main(String[] args) throws Exception
    {
        //System.setProperty("--illegal-access", "deny");
        Check_ArrayList check_AL = new Check_ArrayList();
        check_AL.AddElem(AL);
    }

    static int getCapacity(ArrayList<?> l) throws Exception
    {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}//иоо
