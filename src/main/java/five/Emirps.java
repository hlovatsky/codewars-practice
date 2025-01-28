package five;

import java.util.*;

/*
If you reverse the word "emirp" you will have the word "prime".
That idea is related with the purpose of this kata: we should select all the primes that when reversed are a different prime (so palindromic primes should be discarded).
For example: 13, 17 are prime numbers and the reversed respectively are 31, 71 which are also primes,
so 13 and 17 are "emirps". But primes 757, 787, 797 are palindromic primes,
meaning that the reversed number is the same as the original, so they are not considered as "emirps" and should be discarded.

Your task:
Create a function that receives one argument n, as an upper limit, and the return the following array:
[number_of_emirps_below_n, largest_emirp_below_n, sum_of_emirps_below_n]
 */

public class Emirps {

    public long[] findEmirp(long n) {
        ArrayList<Integer> emirps = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isEmirp(i)) {
                emirps.add(i);
            }
        }

        int numEmirps = emirps.size();
        int largestEmirp = emirps.isEmpty() ? 0 : Collections.max(emirps);
        int sumEmirps = emirps.stream().mapToInt(Integer::intValue).sum();

        return new long[]{numEmirps, largestEmirp, sumEmirps};
    }

    private boolean isEmirp(int number) {
        long reversed = reverseNumber(number);
        return number != reversed && isPrime(number) && isPrime(reversed);
    }

    private long reverseNumber(long number) {
        String numberStr = Long.toString(number);
        String reversedStr = new StringBuilder(numberStr).reverse().toString();
        return Long.parseLong(reversedStr);
    }

    private boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}