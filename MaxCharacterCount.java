public class MaxCharacterCount
{
    
    public static void main(String[] args) {
        String name = "gprogrammminggg";

        int maxCount = 0;
        char maxCharacter = ' ';
        for(int i = 0 ; i < name.length() ; i++)
        {
            char ch = name.charAt(i);
            int count = 1;
            boolean isAlreadyTaken = false;
            for(int k= 0 ; k< i ; k++)
            {
                if(ch == name.charAt(k))
                {
                    isAlreadyTaken = true;
                    break;
                }
            }
            if(isAlreadyTaken)
            {
                continue;
            }
            for(int j = i + 1 ; j < name.length() ; j++)
            {
                if(ch == name.charAt(j))
                {
                    count++;
                } 
            }
            if(count > maxCount)
            {
                maxCount = count ;
                maxCharacter = ch  ;
            }
        }
        System.out.println(maxCharacter + " -> " + maxCount);
    }
}
