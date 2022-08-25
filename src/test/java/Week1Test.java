import activities.Week1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Week1Test {

    @Test
    void test_medianTwoSortedArrays_case_1() {
        Integer[] A = {1,3};
        Integer[] B = {2};

        double result = Week1.medianTwoSortedArrays(A,B);

        Assertions.assertEquals(2,result);

    }

    @Test
    void test_medianTwoSortedArrays_case_2() {
        Integer[] A = {1,2};
        Integer[] B = {3,4};

        double result = Week1.medianTwoSortedArrays(A,B);

        Assertions.assertEquals(2.5,result);
    }

    @Test
    void test_mergeSortedLists_case_1() {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        List<Integer> pass = new ArrayList<>();

        list1.add(1);
        list1.add(4);
        list1.add(6);

        list2.add(1);
        list2.add(3);
        list2.add(4);

        list3.add(2);
        list3.add(6);

        pass.add(1);
        pass.add(1);
        pass.add(2);
        pass.add(3);
        pass.add(4);
        pass.add(4);
        pass.add(6);
        pass.add(6);

        List<LinkedList<Integer>> lists = new ArrayList<>();

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        List<Integer> result = Week1.mergeSortedLists(lists);

        Assertions.assertEquals(pass,result);

    }

    @Test
    void test_mergeSortedLists_case_2() {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        List<Integer> pass = new ArrayList<>();

        List<LinkedList<Integer>> lists = new ArrayList<>();

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        List<Integer> result = Week1.mergeSortedLists(lists);

        Assertions.assertEquals(pass,result);

    }
}
