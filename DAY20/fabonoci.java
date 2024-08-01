public class fabonoci {
    public static int fav(int n){
        if(n==0||n==1) return n;
        int ans1=fav(n-1);
        int ans2=fav(n-2);
        return ans1+ans2;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fav(n));
    }
}
