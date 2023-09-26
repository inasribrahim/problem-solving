package org.example.find_first_index;

public class FindFirstIndex {

    public static void main(String[] args){
//        String haystack = "sadbutsad", needle = "sad"; // passed
        String haystack = "leetcode", needle = "leeto"; // passed

        System.out.println(strStr(haystack,needle));

    }

    public static int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
    }
}
