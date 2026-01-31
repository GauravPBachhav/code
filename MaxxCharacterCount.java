public class MaxxCharacterCount
{
    
    public static void main(String[] args) {
        String name = "gprogrammminggg";

        int maxxcount = 0;
        char maxxcharacter = ' ';
        for(int i = 0 ; i< name.length() ; i++)
        {
            char ch = name.charAt(i);
            int count = 1;
            boolean isalreadytaken = false;
            for(int k= 0 ; k< i ; k++)
            {
                if(ch == name.charAt(k))
                {
                    isalreadytaken= true;
                    break;
                }
            }
            if(isalreadytaken)
            {
                continue;
            }
            for( int j = i+1 ; j < name.length() ; j ++ )
            {
                if(ch == name.charAt(j))
                {
                    count++;
                } 
            }
            if(count > maxxcount)
            {
                maxxcount = count ;
                maxxcharacter = ch  ;
            }
        }
        System.out.println(maxxcharacter + " -> " + maxxcount);
    }
}
