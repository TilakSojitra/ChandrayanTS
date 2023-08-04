package org.chandrayan.ts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverClassTest {
    DriverClass driverClass = new DriverClass();

    @Test
    public void testTest(){
        assertEquals(driverClass.add(2,3),2);
    }
}
