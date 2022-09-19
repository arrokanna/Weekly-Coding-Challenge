package activities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Week4Test {

    @Test
    void test_secondGreatest_case_1(){
        Assertions.assertEquals(2, Week4.secondGreatest(1,2,3));
    }

    @Test
    void test_secondGreatest_case_2(){
        Assertions.assertEquals(10, Week4.secondGreatest(10,15,5));
    }

    @Test
    void test_secondGreatest_case_3(){
        Assertions.assertEquals(500, Week4.secondGreatest(100,999,500));
    }

    @Test
    void test_sumOfString_case_1(){
        Assertions.assertEquals(7, Week4.sumOfString("ab1231da"));
    }

}
