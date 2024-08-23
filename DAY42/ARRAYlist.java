import java.util.*;
public class ARRAYlist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(); 
        //if you adding the value in arraylist
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);

        list.add(2,5);  //this is another way to add element in an array at a specific index
        System.out.println(list);

        //if you want to know ki hamare 2 index pr konsa element hai 
        //use get operation  --> in const time o(1)
        int elem=list.get(3);
        System.out.println(elem);

        //if you want to delete element in a particular index
        //use remove operation
        list.remove(3);
        System.out.println(list);  //-->it is using linear time 0(n)


        //if you want to update an elemnet at a particular index
        //use set element
        list.set(2, 3);   //-->it is using linear time 0(n)
        System.out.println(list);


        //if you want to know this element is exist in my array or not
        //use contain operation
        boolean give_answer=list.contains(3);
        boolean give_answer2=list.contains(11);
        System.err.println(give_answer);
        System.err.println(give_answer2);


        //if you want to know the length of the arraylist 
        //use size() fuction --> this is fuction not a method like a check the array length
        int n=list.size();
        System.out.println(n);
    }
}
