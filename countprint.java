
import java.util.LinkedHashMap;

public class countprint {

    public static void main(String[] args) {
        String name = "Programming";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < name.length(); i++) {

            if (map.containsKey(name.charAt(i))) {
                map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
            } else {
                map.put(name.charAt(i), 1);
            }

        }

        System.out.println(map
        );

        System.out.println();

        for (int i = 0; i < name.length(); i++) {

            int count = 1;
            boolean alreadytaken = false;

            for (int k = 0; k < i; k++) {

                if (name.charAt(i) == name.charAt(k)) {
                    alreadytaken = true;
                    break;
                }

            }

            if (alreadytaken) {
                continue;
            }

            for (int j = i + 1; j < name.length(); j++) {

                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }

            }

            System.out.println(name.charAt(i) + " -> " + count);

        }

    }
}

// public class main1 {
//     public static String unrepeated(String name) {
//         String temp = name;
//         char[] array = new char[temp.length()];
//         int index = 0;
//         for (int i = 0; i < temp.length(); i++) 
//         {
//             boolean isrepeated = false;
//             for(int j = 0 ; j<index ; j++)
//             {
//                 if(temp.charAt(i)==array[j])
//                 {
//                    isrepeated = true;
//                    break;
//                 }
//             }
//              if(!isrepeated)
//                 {
//                     array[index]=temp.charAt(i);
//                     index++;
//                 }
//         }
//         return new String(array , 0 ,index);
//     }
//     public static void main(String[] args) {
//         String name = "programming";
//         String result = unrepeated(name);
//         System.out.println(result);
//         // for (int i = 0; i < name.length(); i++) {
//         //     int count = 1;
//         //     char ch = name.charAt(i);
//         //     boolean isrepeated = false;
//         //     for (int k = 0; k < i; k++) {
//         //         if (ch == name.charAt(k)) {
//         //             isrepeated = true;
//         //             break;
//         //         }
//         //     }
//         //     if (isrepeated) {
//         //         continue;
//         //     }
//         //     for (int j = i + 1; j < name.length(); j++) {
//         //         if (ch == name.charAt(j)) {
//         //             count++;
//         //         }
//         //     }
//         //     System.out.println(ch + "-> " + count);
//         // }
//     }
// }
// // import java.util.*;
// // import java.util.HashMap;
// // public class main1 {
// //     public static void main(String[] args) {
// //         String str = "aabbccdccccddd";
// //         HashMap<Character , Integer> map = new HashMap<>();
// //         int count = 1;
// //         for(int i = 0 ; i<str.length() ; i++)
// //             {
// //                 char ch = str.charAt(i);
// //                 if(map.containsKey(ch))
// //                 {
// //                     map.put(ch, map.get(ch)+1);
// //                 }
// //                 else{
// //                     map.put(ch, count);
// //                 }
// //         }
// //          String maxKey = getKeyWithMaxValue(map);
// //     }
// // }
