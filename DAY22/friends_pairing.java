public class friends_pairing {
    public static int pairing(int n){
        if(n==1||n==2){
            return n;
        }
        int c1=pairing(n-1);
        int c2= pairing(n-2);
        int pairways= (n-1) * c2;
        int total= c1+ pairways;
        return total;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(pairing(n));
    }
}
