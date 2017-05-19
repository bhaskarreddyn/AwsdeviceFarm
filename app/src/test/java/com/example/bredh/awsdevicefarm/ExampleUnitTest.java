package com.example.bredh.awsdevicefarm;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private MainActivity Calculation=new MainActivity();

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testFindMax(){

        assertEquals(20,Calculation.multyply(4,5));
        //assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        //assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
    }

}