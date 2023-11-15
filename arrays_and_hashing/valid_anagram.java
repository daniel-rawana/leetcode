package arrays_and_hashing;

import java.util.*;

class Solution {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h = new HashMap<>();
        Character c;
        for (int i = 0; i < s.length(); i++)
            h.add(s.charAt(i));
        System.out.println(h.toString());
        for (int i = 0; i < t.length(); i++)
            {
                c = t.charAt(i);
                if (!h.contains(c)) {
                    return(false);
                }
                else{
                    h.remove(c);
                    
                }
            }
        return(true);
    }
        public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}

