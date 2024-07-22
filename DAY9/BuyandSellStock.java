public class BuyandSellStock {
    public static int stock(int n[]){
        int min= n[0];
        int profit=0;
        for(int i=0;i<n.length;i++){
            int diff= n[i]-min;
            profit=Math.max(profit, diff);
            min=Math.min(min, n[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
     int n[]={7,1,5,3,6,4};
     System.out.println(stock(n));   
    }
}
