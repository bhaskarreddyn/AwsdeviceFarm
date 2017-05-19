package com.example.bredh.awsdevicefarm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bredh on 19/05/17.
 */
@SuppressWarnings("deprecation")
public class CalculationsTest {

    Calculations cals;
    @Before
    public void setUp() throws Exception {

        cals=new Calculations();
    }

    @Test
    public void sum() throws Exception {

        assertEquals(5,cals.sum(2,3));
    }

    @Test
    public void subtract() throws Exception {

        assertEquals(30,cals.subtract(40,10));
    }

    @Test
    public void divide() throws Exception {

        assertEquals(5,cals.divide(30,6));
    }

    @Test
    public void multiply() throws Exception {

        assertEquals(30,cals.multiply(5,6));
    }

}