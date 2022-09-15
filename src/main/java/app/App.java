package app;

import activities.Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>(Arrays.asList(1,2,3,4));

        System.out.println(test.stream().reduce((x,y) -> x*y));
        int number = test.stream().mapToInt(Integer::intValue).reduce(1,(x,y) -> x*y);

        System.out.println(number);

    }



    //0.3 second 100T
    //25 seconds 1M
    static void calcPrims() {
        long startTime = System.nanoTime();
        List<Integer> primes = new ArrayList<>();
        primes.add(2);

        int currentNumber = 3;
        while (currentNumber < 100000) {
            boolean check = true;
            for (int i = 2; i < currentNumber / 2; i++) {
                if (currentNumber % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                primes.add(currentNumber);
            }
            currentNumber += 1;
        }

        //System.out.println(primes);

        long duration = System.nanoTime() - startTime;
        System.out.println("time: " +duration);
    }

    // 0.05 seconds 100T
    // 2.2 seconds 1M,
    // 167.4 seconds 10M
    static void calcPrimesV2() {
        long startTime = System.nanoTime();
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        int currentNumber = 3;
        while (currentNumber < 10000000) {
            boolean check = true;
            for (int i = 0; i < primes.size(); i++) {
                if (currentNumber % primes.get(i) == 0) {
                    check = false;
                    break;
                }
                if (primes.get(i) > currentNumber / 2) {
                    break;
                }
            }
            if (check) {
                primes.add(currentNumber);
            }
            currentNumber += 1;
        }

        long duration = System.nanoTime() - startTime;
        System.out.println("time: " +duration);
    }

    // 134.68 seconds 100T
    static void calcPrimesV3() {
        long startTime = System.nanoTime();
        List<Integer> primes = new LinkedList<>();
        primes.add(2);

        int currentNumber = 3;
        while (currentNumber < 100000) {
            boolean check = true;
            for (int i = 0; i < primes.size(); i++) {
                if (currentNumber % primes.get(i) == 0) {
                    check = false;
                    break;
                }
                if (primes.get(i) > currentNumber / 2) {
                    break;
                }
            }
            if (check) {
                primes.add(currentNumber);
            }
            currentNumber += 1;
        }

        //System.out.println(primes);

        long duration = System.nanoTime() - startTime;
        System.out.println("time: " +duration);
    }

    //4.5 seconds 1M
    static void calcPrimesV4() {
        long startTime = System.nanoTime();
        List<Integer> primes = new ArrayList<>();
        primes.add(2);

        int currentNumber = 3;
        while (currentNumber < 1000000) {
            boolean check = true;
            for (Integer prime : primes) {
                if (currentNumber % prime == 0) {
                    check = false;
                    break;
                }
                if (prime > currentNumber / 2) {
                    break;
                }
            }
            if (check) {
                primes.add(currentNumber);
            }
            currentNumber += 1;
        }

        //System.out.println(primes);

        long duration = System.nanoTime() - startTime;
        System.out.println("time: " +duration);
    }

    //23.74 seconds 1M
    static void calcPrimesV5() {
        long startTime = System.nanoTime();
        List<Integer> primes = new LinkedList<>();
        primes.add(2);

        int currentNumber = 3;
        while (currentNumber < 1000000) {
            boolean check = true;
            for (Integer prime : primes) {
                if (currentNumber % prime == 0) {
                    check = false;
                    break;
                }
                if (prime > currentNumber / 2) {
                    break;
                }
            }
            if (check) {
                primes.add(currentNumber);
            }
            currentNumber += 1;
        }

        //System.out.println(primes);

        long duration = System.nanoTime() - startTime;
        System.out.println("time: " +duration);
    }

}
