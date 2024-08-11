

public class quick_sort {
    public static void printt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void quick(int arr[],int si,int ei){
        if(si>=ei) return;

        int pidx=partition(arr,si,ei);
        quick(arr, si, pidx-1);
        quick(arr,pidx+1,ei);

    }


    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;    //age jagah bana raha hai yee
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={3,53,1,2,4,5};
        quick(arr, 0, arr.length-1);
        printt(arr);
    }
}
