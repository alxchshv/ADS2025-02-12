package by.it.group410902.podryabinkin;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи со вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    BigInteger fastB(Integer n) {
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)
        if (n == 0) return BigInteger.ZERO;
        if(n == 1) return  BigInteger.ONE;
        BigInteger[] nomb = new BigInteger[n+1];
        nomb[0] = BigInteger.ZERO;
        nomb[1] = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
            nomb[i] = nomb[i-1].add((nomb[i-2]));
        }
        return nomb[n];
    }

}

