package arrays_and_hashing;

import java.util.*;

class Solution {
    public static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(a);
        System.out.println(b);
        if (Arrays.equals(a,b)) {
            return(true);
        }
        return(false);
    }
        public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}

