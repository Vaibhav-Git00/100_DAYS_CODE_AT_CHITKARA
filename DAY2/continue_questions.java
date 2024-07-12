import java.util.*;

public class continue_questions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=1;
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        do{
            if(i%5==0){
                i++;
                continue;
            }
            
            System.out.println(i);
            i++;
        }while(i<=num);
        System.out.println("this number is not printing because it is divisble by 5.");

    }
}
