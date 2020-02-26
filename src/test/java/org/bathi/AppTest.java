package org.bathi;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;


/**
 * Unit test for App Test Assignment.
 */
public class AppTest
{
    private App t1;
    private App t2;
    private App t3 = t1;

    @Before
    public void beforeTest()
    {
        t1 = new App(1, "BathiNtshinga");
        t2 = new App(1, "BathiNtshinga");
    }
    @Test
    public void equalsEqualityTest() throws Exception
    {
        assertEquals(t1, t2);
        assertEquals(t1, t3);
        assertEquals(t1, t3);
    }
    @Test
    public void equalsIdentityTest()
    {
        assertSame(t1,t2);
        assertSame(t1,t3);
        assertSame(t2,t3);
    }
    @Ignore
    @Test
    public void equalsDisableTest()
    {
        assertSame(t1,t2);
        assertSame(t1,t3);
        assertSame(t2,t3);
    }

    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }

}

