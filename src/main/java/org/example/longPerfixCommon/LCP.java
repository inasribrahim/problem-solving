package org.example.longPerfixCommon;

import java.util.Arrays;

public class LCP {

    public static void main(String[] args){
        String[] strs = {"flower"," ","fzight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"a"};
//        String[] strs = {"ab", "a"};

        System.out.println("Longest Common Prefix : "+longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
//        for (String sttr : strs){
//            System.out.println(sttr);
//        }
        String first = strs[0];
        String last = strs[strs.length-1];

        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

//            String ans = "" ;
//
//            int size = strs[0].toCharArray().length;
//            for(int i = 0 ; i < size ; i++){
//                    if(strs[0].toCharArray().length == 1) {
//                        char re = strs[0].charAt(i);
//                        ans = ans  + re;
//                    }
//                    else {
//                        if(i < strs[0].toCharArray().length - 1 &&  strs[0].charAt(i)== strs[1].charAt(i) && i < strs[1].toCharArray().length - 1 && strs[1].charAt(i) == strs[2].charAt(i)){
//                            ans += strs[0].charAt(i) ;
//                        }
//                        else {
//                            break;
//                        }
//                    }
//
//                }
//                return ans;
//            }


}
