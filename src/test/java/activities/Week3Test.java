package activities;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Week3Test {

    @ParameterizedTest
    @ValueSource(strings = {"#CD5C5C", "#EAECEE", "#eaecee"})
    void test_isValidHexCode_case_true(String hexCode) {
        Assertions.assertTrue(Week3.isValidHexCode(hexCode));
    }

    @ParameterizedTest
    @ValueSource(strings = {"#CD5C58C", "#CD5C5Z", "#CD5C&C", "CD5C5C"})
    void test_isValidHexCode_case_false(String hexCode) {
        Assertions.assertFalse(Week3.isValidHexCode(hexCode));
    }

    @Test
    void test_nextPrime_case_1() {
        int result = Week3.nextPrime(12);

        Assertions.assertEquals(13,result);
    }

    @Test
    void test_nextPrime_case_2() {
        int result = Week3.nextPrime(24);

        Assertions.assertEquals(29,result);
    }

    @Test
    void test_nextPrime_case_3() {
        int result = Week3.nextPrime(11);

        Assertions.assertEquals(11,result);
    }

    // java tests...
    @Test
    void test_sortDigits_case_1() {
        List<Integer> test = new ArrayList<>(Arrays.asList(515, 341, 98, 44, 211));
        List<Integer> passAsc = new ArrayList<>(Arrays.asList(155, 134, 89, 44, 112));
        List<Integer> passDesc = new ArrayList<>(Arrays.asList(551, 431, 98, 44, 211));

        Assertions.assertEquals(passAsc, Week3.sortDigits(test,"asc"));
        Assertions.assertEquals(passDesc, Week3.sortDigits(test, "desc"));
    }

    @Test
    void test_sortDigits_case_2() {
        List<Integer> test = new ArrayList<>(Arrays.asList(63251, 78221));
        List<Integer> passAsc = new ArrayList<>(Arrays.asList(12356, 12278));
        List<Integer> passDesc = new ArrayList<>(Arrays.asList(65321, 87221));

        Assertions.assertEquals(passAsc, Week3.sortDigits(test,"asc"));
        Assertions.assertEquals(passDesc, Week3.sortDigits(test, "desc"));
    }

    @Test
    void test_sortDigits_case_3() {
        List<Integer> test = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Assertions.assertEquals(test, Week3.sortDigits(test,"asc"));
        Assertions.assertEquals(test, Week3.sortDigits(test,"desc"));
    }

    @Test
    void test_canPartition_case_1() {
        List<Integer> test = new ArrayList<>(Arrays.asList(2, 8, 4, 1));
        Assertions.assertTrue(Week3.canPartition(test));
    }

    @Test
    void test_canPartition_case_2() {
        List<Integer> test = new ArrayList<>(Arrays.asList(-1, -20, 5, -1, -2, 2));
        Assertions.assertTrue(Week3.canPartition(test));
    }

    @Test
    void test_canPartition_case_3() {
        List<Integer> test = new ArrayList<>(Arrays.asList(-1, -10, 1, -2, 20));
        Assertions.assertFalse(Week3.canPartition(test));
    }

}
