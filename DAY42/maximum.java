import java.util.*;

public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(2);
        // Collections.sort(list);   //if you want to sort an array list then use collection operations
        // int max=list.get(list.size()-1);
        // System.out.println(max);
        int max=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     max=Math.max(max, list.get(i));
        // }
        // System.out.println(max);


        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println(max);

    }
}
