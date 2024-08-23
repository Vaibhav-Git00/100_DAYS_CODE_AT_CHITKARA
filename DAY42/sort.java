import java.util.*;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        //if you want to sort that Array list use inbuilt fuction 
        //collections.sort(list)
        Collections.sort(list);
        System.out.println(list);

        //reverse order sorting in Array list inbuilt function
        Collections.sort(list, Collections.reverseOrder());   //comparator --> fnx logic
        System.out.println(list);
    }
}
