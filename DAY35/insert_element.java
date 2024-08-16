//insert_element

public class insert_element {
    public static void back(int arr[],int i,int var){
        //base case
        if(i==arr.length){
            printle(arr);
            return;
        }

        //recursion
        arr[i]=var;
        back(arr, i+1, var+1);  //recursion ke baad hi hamesh backtracking ka use hota hai 
        arr[i]=arr[i]-2;      //this is the backtracking this is print with the help of ,after use of recursion when we return the then backtracking changes in the array
    }

    public static void printle(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        back(arr, 0, 1);
        printle(arr);
        

    }
}
