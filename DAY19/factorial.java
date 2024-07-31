public class factorial {
    public static int  factori(int n){
        if(n==1){
            return 1;
        }
        int sp=factori(n-1);
        int ans=n*sp;
        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(factori(n));
    }
}
