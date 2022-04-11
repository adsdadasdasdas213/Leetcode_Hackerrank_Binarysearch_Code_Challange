package Leetcode;

import java.util.Scanner;

/**
 * Name: Bahriddin
 * Date: 11.04.2022
 * Time: 15:29:50
 * Link: https://leetcode.com/problems/fibonacci-number
 * Description: null
 */
public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int n = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println("Output: " + solution.fib(n));
    }

}

class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int sum = a + b;
        while (n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }
}