package arrays_and_hashing;

import java.util.*;

class Solution {
    public static boolean isAnagram(String s, String t) {
        if (t.length() < s.length()) {
            return(false);
        }
        ArrayList<Character> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            l.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (l.contains(t.charAt(i))) {
                l.remove((Character)t.charAt(i));
            }
            else
                return(false);
        }
        return(true);
    }
        public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}

