import java.util.*;
public class Swap {
    public static void swap(ArrayList<Integer> list,int ind1,int ind2){
        int temp=list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(1);
        int indx1=1, indx2=3;
        System.out.println(list);
        swap(list, indx1, indx2);
    }
}
