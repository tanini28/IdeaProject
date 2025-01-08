import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionMain {

    //Колекції
    //public static void main(String[] args) {
       // ArrayList<Short> nums = new ArrayList<>();
       // nums.add((short)56);
       // short num1 = 45;
       // nums.add(num1);
        //nums.add(1, (short)13);
      //  nums.remove(1);
       // nums.clear();
        //nums.isEmpty();
      //  nums.set(0, (short)90);
      //  Short[] numbers = (Short[]) nums.toArray();
      //  for (int i = 0; i < nums.size(); i++)
       // for (short num : nums)
            //System.out.println(nums.get(i));
          //  System.out.println(num);
    //}


    //Колекції LinkedList
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.5f);
        numbers.add(15.523f);
        numbers.add(8.427f);

       // numbers.removeFirst()
        for (float num : numbers)
            System.out.println(num);
    }
}
