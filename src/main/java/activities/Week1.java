package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Week1 {

    private Week1 () {
    }

    public static double medianTwoSortedArrays(Integer[] A, Integer[] B) {
        double result = 0;

        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(A));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(B));
        List<LinkedList<Integer>> lists = new ArrayList<>();

        lists.add(list1);
        lists.add(list2);

        List<Integer> listResult = mergeSortedLists(lists);

        result = listResult.get(listResult.size()/2);

        if (listResult.size() % 2 == 0) {
            result += listResult.get(listResult.size()/2 - 1);
            result /= 2;
        }

        return result;
    }

    public static List<Integer> mergeSortedLists(List<LinkedList<Integer>> A) {
        List<Integer> list = new LinkedList<>();

        while (!A.isEmpty()) {
            int value = 2147483647;
            int location = -1;
            for (int i = 0; i < A.size(); i++) {
                if (!A.get(i).isEmpty() && A.get(i).get(0) < value) {
                    value = A.get(i).get(0);
                    location = i;
                }
            }
            if (location != -1) {
                list.add(A.get(location).removeFirst());
            } else {
                break;
            }
        }

        return list;
    }

}
