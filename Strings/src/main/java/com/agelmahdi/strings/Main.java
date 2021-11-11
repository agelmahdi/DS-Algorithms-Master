package com.agelmahdi.strings;

import com.agelmahdi.strings.challenges.ValidAnagram;
import com.agelmahdi.strings.challenges.ValidPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(ValidAnagram.isAnagram("a","ab"));
        System.out.println(ValidAnagram.isAnagram("anagram","nagaram"));

        System.out.println(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(ValidPalindrome.isPalindrome("race a car"));
        System.out.println(ValidPalindrome.isPalindrome(" "));



    }
}
