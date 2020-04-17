package com.sapient;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CheckEvenTest 
    extends TestCase
{
	private CheckEven a = new CheckEven();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CheckEvenTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CheckEvenTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCheckEven()
    {
		
        assertTrue( a.check(2));
		assertFalse( a.check(3));
    }
}
