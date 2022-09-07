package activities;

public class Week2 {

    private Week2() {}

    public static int largestGap(int[] A) {
        int min = A[0];
        int max = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }

        return max - min;
    }

    public static int maximumSumSubArray(int[] A) {
        int result = A[0];
        for (int i = 0; i < A.length; i++) {
            int subSum = 0;
            for (int x = i; x < A.length; x++) {
                subSum += A[x];
                if (subSum > result) {
                    result = subSum;
                }
            }
        }
        return result;
    }
}
