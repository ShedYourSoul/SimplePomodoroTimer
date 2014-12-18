package pomotimer;

import junit.framework.TestCase;

public class TestPomoTimer extends TestCase{

    public void testTimer()
    {
        PomoTimer pomoTimer = new PomoTimer();
        pomoTimer.startBreakSession();
        assertEquals(300, pomoTimer.getTimeLeft());
    }

}
