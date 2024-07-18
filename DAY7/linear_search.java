
public class linear_search {
    public static int search(int numbet[],int key){
        for(int i=0;i<numbet.length;i++){
            if(numbet[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,7,9,5,3,6};
        int target =20;
        int index=search(arr, target);
        if(index==-1){
            System.out.println("this is not found");
        }
        else{
            System.out.println("found at index:"+ index);
        }
    }
}   

