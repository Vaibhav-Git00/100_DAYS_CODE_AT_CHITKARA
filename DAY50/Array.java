//2022. Convert 1D Array Into 2D Array
import java.util.*;
public class Array {
    public static  List<List<Integer>> construct2DArray(List<Integer> original, int m, int n) {
        if (original.size() != m * n) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(original.get(k++));
            }
            res.add(row);
        }
        return res;
    }
    public static void main(String[] args) {
     int m = 2, n = 2;
     int arr[]={1,2,3,4};
     ArrayList <Integer> original=new ArrayList<>();
     for(int num:arr){
        original.add(num);
     }
     System.out.println(construct2DArray(original, m, n));
    }
}
