import activities.Week2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Week2Test {

    @Test
    void test_largestGap_case1() {
        int[] arr = {3, 10, 6, 7};
        int result = Week2.largestGap(arr);

        Assertions.assertEquals(7, result);

    }

    @Test
    void test_largestGap_case2() {
        int[] arr = {-3, -1, 6, 7, 0};
        int result = Week2.largestGap(arr);

        Assertions.assertEquals(10, result);
    }

    @Test
    void test_largestGap_custom() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = Week2.largestGap(arr);

        Assertions.assertEquals(9, result);
    }

    @Test
    void test_maximumSumSubArray_case1() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = Week2.maximumSumSubArray(arr);

        Assertions.assertEquals(6, result);
    }

    @Test
    void test_maximumSumSubArray_case2() {
        int[] arr = {2, 2, -2};
        int result = Week2.maximumSumSubArray(arr);

        Assertions.assertEquals(4, result);
    }

    @Test
    void test_maximumSumSubArray_custom1() {
        int[] arr = {-3, -1, 6, 7, 0};
        int result = Week2.maximumSumSubArray(arr);

        Assertions.assertEquals(13, result);
    }

}
