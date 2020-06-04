package com.company;

import java.math.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("c = sqrt(a^2, b^2) bigInt");
        BigInteger a = BigInteger.valueOf(214743);
        BigInteger b = BigInteger.valueOf(128946);
        a = a.multiply(a);
        b = b.multiply(b);
        BigInteger c = a.add(b).sqrt();
        System.out.println(c);
        System.out.println("a^2 + b^2 + 2*a*b = c");
        BigDecimal a1 = BigDecimal.valueOf(18925.06);
        BigDecimal b1 = BigDecimal.valueOf(23451.06);
        BigDecimal ab2 = a1.multiply(b1);
        ab2 = ab2.add(ab2);
        a1 = a1.multiply(a1);
        b1 = b1.multiply(b1);
        BigDecimal c1 = a1.add(b1).add(ab2);
        System.out.println(c1);
    }
}