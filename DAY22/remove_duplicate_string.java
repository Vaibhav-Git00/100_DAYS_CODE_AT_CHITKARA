
public class remove_duplicate_string {
    public static void remove(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char crrchar=str.charAt(idx);
        if(map[crrchar-'a']==true){
            remove(str, idx+1, newstr, map);
        }
        else{
            map[crrchar-'a']=true;
            remove(str, idx, newstr.append(crrchar), map);
        }
    }
    public static void main(String[] args) {
        String str="vaibhavkesharwani";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
