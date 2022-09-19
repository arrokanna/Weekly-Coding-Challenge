package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Week4 {

    private Week4() {}

    public static int secondGreatest(int num1, int num2, int num3) {
        // largest difference is second greatest
        int a = Math.abs(num2 - num3);
        int b = Math.abs(num1 - num3);
        int c = Math.abs(num1 - num2);

        if (a > b && a > c) {
            return num1;
        } else if (b > c) {
            return num2;
        } else {
            return num3;
        }
    }

    public static int sumOfString(String string) {
        //string->chars->int->filter non number->sum
        return string.chars().boxed().mapToInt(Character::getNumericValue).filter(x->x>=0&&x<=9).sum();
    }

}
