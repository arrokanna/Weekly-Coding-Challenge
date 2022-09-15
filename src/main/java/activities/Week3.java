package activities;

import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Week3 {

    private Week3() {}

    // ... C# only...
    public static boolean isValidHexCode(String hexCode) {
        Pattern pattern = Pattern.compile("^#[0-9A-Fa-f]{6}");
        Matcher matcher = pattern.matcher(hexCode);

        return matcher.matches();
    }

    public static int nextPrime(int number) {
        int currentNumber = number;

        while (true) {
            boolean check = true;
            for (int i = 2; i < currentNumber / 2; i++) {
                if (currentNumber % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                break;
            }
            currentNumber += 1;
        }

        return currentNumber;
    }

    // actual java questions...
    public static List<Integer> sortDigits(List<Integer> A, String order) {

        for (int x = 0; x < A.size(); x++) {
            List<Character> digits = A.get(x).toString().chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList());

            if (order.equalsIgnoreCase("asc")) {
                A.set(x, Integer.parseInt(digits.stream().sorted()
                        .map(String::valueOf)
                        .collect(Collectors.joining())));
            }

            if (order.equalsIgnoreCase("desc")) {
                A.set(x, Integer.parseInt(digits.stream().sorted(Comparator.reverseOrder())
                        .map(String::valueOf)
                        .collect(Collectors.joining())));
            }

        }

        return A;
    }

    public static boolean canPartition(List<Integer> A) {
        boolean result = false;

        for (int y = 0; y < A.size(); y++) {
            int factor = 1;

            for (int x = 0; x < A.size(); x++) {
                if (x != y) {
                    factor *= A.get(x);
                }
            }

            if (A.get(y) == factor) {
                result = true;
                break;
            }
        }
        return result;
    }


}
