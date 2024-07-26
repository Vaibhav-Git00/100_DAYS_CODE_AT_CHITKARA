
public class shortestpath {
    public static float shortest(String charr){
        int x=0;
        int y=0;
        for(int i=0;i<charr.length();i++){
            if(charr.charAt(i)=='S'){
                y--;
            }
            if(charr.charAt(i)=='N'){
                y++;
            }
            if(charr.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);  

    }
    public static void main(String[] args) {
        String charr="WNEENESENNN";
        System.out.println(shortest(charr));

    }
}

