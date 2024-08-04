public class friends_pairing {
    public static int pairing(int n){
        if(n==1||n==2){
            return n;
        }
        //single
        int c1=pairing(n-1);
        //pair
        int c2= pairing(n-2);        
        int pairways= (n-1) * c2;     //n-1 is kitne pairs ban satkte haii and multilpy be c2 is the showing of pair choices 

        //total ways
        int total= c1+ pairways;
        return total;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(pairing(n));
    }
}
