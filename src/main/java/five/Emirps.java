package five;

import java.util.*;

/*
If you reverse the word "emirp" you will have the word "prime".
That idea is related with the purpose of this kata: we should select all the primes that when reversed are a different prime (so palindromic primes should be discarded).
For example: 13, 17 are prime numbers and the reversed respectively are 31, 71 which are also primes,
so 13 and 17 are "emirps". But primes 757, 787, 797 are palindromic primes,
meaning that the reversed number is the same as the original, so they are not considered as "emirps" and should be discarded.
The emirps sequence is registered in OEIS as A006567

Your task:
Create a function that receives one argument n, as an upper limit, and the return the following array:
[number_of_emirps_below_n, largest_emirp_below_n, sum_of_emirps_below_n]
 */

public class Emirps {

    public long[] findEmirp(long n) {
        long[] emirpNumbers = {13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157, 167, 179, 199, 311, 337, 347, 359, 389, 701, 709, 733, 739, 743, 751, 761, 769, 907, 937, 941, 953, 967, 971, 983, 991, 1009, 1021, 1031, 1033, 1061, 1069, 1091, 1097, 1103, 1109, 1151, 1153, 1181, 1193, 1201};
        List<Long> resultList = new ArrayList<>();
        for (long emirpNumber : emirpNumbers) {
            if (n >= emirpNumber) {
                resultList.add(emirpNumber);
            }
        }
        long emirpsSize = resultList.size();
        long maxEmirp = resultList.stream().max(Long::compareTo).orElse(0L);
        long emirpSum = resultList.stream().reduce(0L, Long::sum);
        return new long[]{emirpsSize, maxEmirp, emirpSum};
    }
}