package com.twu;

import java.util.ArrayList;

/**
 * Created by dmn on 28/05/15.
 */
public class PrimeFactors {

    public PrimeFactors () {}

    private static boolean isPrime(int n)
    {
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public ArrayList<Integer> generate(int n) {

        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0 && isPrime(i))
                factors.add(i);
        }

        return factors;
    }
}
