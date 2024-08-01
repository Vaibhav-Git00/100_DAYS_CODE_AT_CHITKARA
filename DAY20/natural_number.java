public class natural_number {
    public static int natural(int n){
        if(n==1){
            return 1;
        }
        int ans=natural(n-1);
        int result=n+ans;
        return result;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(natural(n));
    }
}
