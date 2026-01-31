import java.util.*;
public class removeouterparanthesisi {


    public static void main(String[] args) {
        String parathesis  = "(()())";
StringBuilder str = new StringBuilder();   
Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < parathesis.length() ; i ++)
        {
            char ch = parathesis.charAt(i);


            if(ch == '(')
            {
                    if(!st.isEmpty())
                    {
                        str.append(ch);


                    }
                    st.push(ch);
            }

            else
            {
                    st.pop();
                    if(!st.isEmpty())
                    {
                        str.append(ch);
                    }
            }



        }

String result = str.toString();

System.out.println(result);










    }
    
}
