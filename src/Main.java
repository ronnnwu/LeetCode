
import package1.*;

import java.util.Arrays;

public class Main {

    public static void package1() {

        System.out.println("=================");
        System.out.println("    Ex 1 - 10");
        System.out.println("=================");

        Ex1 ex1 = new Ex1();
        System.out.println(Arrays.toString(ex1.twoSum(new int[] {2, 7, 11, 15}, 9)));

        Ex2 ex2 = new Ex2();
        ListNode l1 = new ListNode(new int[]{2, 4, 3});
        ListNode l2 = new ListNode(new int[]{5, 6, 4});
        System.out.println(ex2.addTwoNumbers(l1, l2));

        Ex3 ex3 = new Ex3();
        System.out.println(ex3.lengthOfLongestSubstring("abcabcbb"));

        Ex4 ex4 = new Ex4();
        System.out.println(ex4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));

        Ex5 ex5 = new Ex5();
        System.out.println(ex5.longestPalindrome("babad"));

        Ex6 ex6 = new Ex6();
        System.out.println(ex6.convert("PAYPALISHIRING", 3));

        Ex7 ex7 = new Ex7();
        System.out.println(ex7.reverse(120));

        Ex8 ex8 = new Ex8();
        System.out.println(ex8.myAtoi("12"));

        Ex9 ex9 = new Ex9();
        System.out.println(ex9.isPalindrome(121));

        Ex10 ex10 = new Ex10();
        System.out.println(ex10.isMatch("aa", "a"));
    }

    public static void main(String[] args) {

        package1();
    }
}
