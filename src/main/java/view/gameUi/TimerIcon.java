package view.gameUi;

import javax.swing.*;
import java.awt.*;

public class TimerIcon extends JLabel {//switch back to JPanel later
    private int time;
    private int maxTime;

    public TimerIcon(int maxTime){
        super("🕰️");
        setOpaque(true);
        setBackground(Color.GRAY);
        setSize(75,75);
        this.maxTime = maxTime;
    }

    public void update(int time){
        this.time = time;
        repaint();//needed??
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Custom paint for the timer (pie-like thing)
        //the ratio is time/maxTime % of the pie
    }
}
