package pomotimer;

import java.util.*;

public class PomoTimer {

    private int timeLeft;
    private Timer timer = new Timer();

    public PomoTimer()
    {

    }

    public void startWorkSession()
    {
        timeLeft = (25 * 60) * 1000;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                setTimeLeft();
            }
        }, 1000, 1000);
    }

    public void startBreakSession()
    {
        timeLeft = (5 * 60) * 1000;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                setTimeLeft();
            }
        }, 1000, 1000);
    }

    public void setTimeLeft()
    {
        if (timeLeft == 1)
            timer.cancel();
        timeLeft--;
    }

    public int getTimeLeft() {
        return timeLeft/1000;
    }
}
