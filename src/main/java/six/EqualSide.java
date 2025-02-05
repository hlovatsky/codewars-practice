package six;

/*
https://www.codewars.com/kata/5679aa472b8f57fb8c000047
 */

public class EqualSide {

    public int getOutlierByForLoop(int[] array) {
        int total = 0;
        int leftSum = 0;
        for (int num : array) {
            total += num;
        }
        for (int i = 0; i < array.length; i++) {
            total -= array[i];
            if (leftSum == total) {
                return i;
            }
            leftSum += array[i];
        }
        return -1;
    }
}
