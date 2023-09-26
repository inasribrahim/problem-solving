package org.example.valid_anagrm;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args){
        //String s = "anagram", t = "nagaram";
       //String s = "rat", t = "car";
        String s = "ab", t = "ba";
//        System.out.println(isAnagram(s,t));
        isAnagram(s,t);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return  false;
        }
        else
        {
            char [] sc = s.toCharArray();
            char [] tc = t.toCharArray();
            Arrays.sort(sc);
            Arrays.sort(tc);
            String scc = new String(sc);
            String tcc = new String(tc);
            if(scc.equals(tcc)) return  true;
            else return false;
        }


//        Arrays.sort(s.toCharArray());
//        Arrays.sort(t.toCharArray());
//        String ss = new String(t.toCharArray());
//        System.out.println(ss);
    }
//        public static boolean isAnagram(String s, String t) {
//        boolean flag = false ;
//        for (char comp: t.toCharArray()){
//            for (int i = 0 ; i < t.length() ;i ++){
//                if(comp != s.charAt(i)) flag = false ;
//                else flag = true;
//            }
//            System.out.println(flag);
//        }
//        if(s.length() != t.length()) flag = false;
//        System.out.println("flag is :" + flag);
//        return flag;
//    }

}
