public class Interval {

    /*
    Write a function that accepts an array of intervals, and returns the sum of all the interval lengths.
    Overlapping intervals should only be counted once.
    Intervals are represented by a pair of integers in the form of an array.
    The first value of the interval will always be less than the second value.
    Interval example: [1, 5] is an interval from 1 to 5. The length of this interval is 4.

    Example:
    [
      [1, 4],
      [7, 10],
      [3, 5]
    ]
     */

    public int sumInterval(int[]... array) {
        int result = 0;
        for (int[] internalArray : array) {
            int firstValue = internalArray[0];
            int secondValue = internalArray[1];
            result += secondValue - firstValue;
        }
        return result;
    }
}
