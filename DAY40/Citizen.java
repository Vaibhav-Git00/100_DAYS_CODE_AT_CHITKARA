public class Citizen {
    public static int countSeniors(String[] details) {
        int n = details.length;
        int count=0;
        for(int i=0;i<n;i++){
            String str = details[i];
            int x = Integer.parseInt(str.substring(11,13));
            if(x>60){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str[]={"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(str));
    }
}
