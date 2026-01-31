import java.util.*;
public class LongestString {
    public static void main(String[] args) {
        String name = "pwwkew";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int i = 0 , j = 0 , maxlength = 0;

        while(j<name.length())
        {
            if(!set.contains(name.charAt(j)))
            {
                set.add(name.charAt(j));
                j++;
                maxlength = Math.max(maxlength , j-i);
            }
            else{

                set.remove(name.charAt(i));
                i++;



            }
        }

        System.out.println(maxlength + " - > " + set);
    }
    
}
