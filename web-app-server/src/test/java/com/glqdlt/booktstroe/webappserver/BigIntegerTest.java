package com.glqdlt.booktstroe.webappserver;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class BigIntegerTest {

    private String FIXTURE = "123123123123123123123123213123";
    private String FIXTURE2 = "12312312312312312312312321312312313";

    @Test
    public void parseStringToBigInteger() throws Exception {
        BigInteger ee = new BigInteger(FIXTURE);
        Assert.assertEquals(1, ee.compareTo(BigInteger.valueOf(Long.MAX_VALUE)));
    }

    @Test
    public void bigIntegerAdd() throws Exception {
        BigInteger long1 = new BigInteger(FIXTURE);
        BigInteger long2 = new BigInteger(FIXTURE2);
        BigInteger added = long1.add(long2);
        BigInteger multiplied = long1.multiply(long2);
        Assert.assertEquals(0, multiplied.compareTo(new BigInteger("1515930344759173588002419047460360445030616201788182957436083499")));
        Assert.assertEquals(0, added.compareTo(new BigInteger("12312435435435435435435444435525436")));
    }

    @Test
    public void compareTo() throws Exception {
        BigInteger long1 = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger long2 = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger long3 = BigInteger.valueOf(Long.MAX_VALUE - 1);
        int ee = long1.compareTo(long2);
        int e2 = long1.compareTo(long3);
        int e3 = long3.compareTo(long1);
        Assert.assertEquals(0, ee);
        Assert.assertEquals(1, e2);
        Assert.assertEquals(-1, e3);
    }
}
