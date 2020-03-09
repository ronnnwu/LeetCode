
import package1.*;

import java.util.Arrays;

public class Main {

    public static void package1() {

        System.out.println("--------------------");
        System.out.println("Ex 1 - 10");
        System.out.println("--------------------");

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
    }

    public static void main(String[] args) {

        package1();
    }
}
