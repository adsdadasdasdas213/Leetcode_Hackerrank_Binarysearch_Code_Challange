package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Name: Bahriddin
 * Date: 11.04.2022
 * Time: 15:59:50
 * Link: https://leetcode.com/problems/count-primes
 * Description: Given an integer n, return the number of prime numbers that are strictly less than n
 */
public class Count_Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int n = scanner.nextInt();
        Count_Primes count_primes = new Count_Primes();
        System.out.println("Output: " + count_primes.countPrimes(n));

    }

    int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i < n; i++)
            if (isPrime[i])
                sum++;
        return sum;
    }
}
