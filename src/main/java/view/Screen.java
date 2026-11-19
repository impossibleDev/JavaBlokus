package view;

import view.overlay.Overlay;

import javax.swing.*;
import java.awt.*;

public abstract class Screen extends JPanel {
    private Overlay currentOverlay;
    public Screen(){
//        super(new BorderLayout());
        setBackground(Color.DARK_GRAY);
        setOpaque(true);
    }

    public void setOverlay(Overlay overlay){
        removeOverlay();
        currentOverlay = overlay;
        add(overlay, BorderLayout.CENTER);
        setComponentZOrder(overlay, 0);
        revalidate();
        repaint();
    }

    public void removeOverlay(){
        if (currentOverlay!=null){
            remove(currentOverlay);
        }
    }
    public void resize(){
        //TODO make it resize the same size as AppFrame size
        setSize(getParent().getSize());
    };
}
