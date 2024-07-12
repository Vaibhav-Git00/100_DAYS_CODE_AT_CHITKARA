import java.util.*;


public class A6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total= pen + pencil +eraser;
        float tax= (float)(total * 0.18);
        System.out.println(total);
        System.out.println(tax);
        System.out.println("encluding gst 18%: "+ (total + tax));
        sc.close();

    }    
}
