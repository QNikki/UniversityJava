package com.company;

import java.math.*;

public class Main {

    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(2147483);
        BigInteger b = BigInteger.valueOf(1289346);
        a = a.multiply(b);
        System.out.println(a);
        long x = a.longValue();
        System.out.println(x);
        BigDecimal c = BigDecimal.valueOf(18925.06);
        BigDecimal d = BigDecimal.valueOf(23451.06);
        c = c.subtract(d.multiply(BigDecimal.valueOf(2.1)));
        System.out.println(c);
        double y = c.doubleValue();
        System.out.println(y);
    }
}