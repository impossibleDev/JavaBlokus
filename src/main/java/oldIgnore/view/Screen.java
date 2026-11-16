package oldIgnore.view;

import javax.swing.*;
import java.awt.*;

public abstract class Screen extends JPanel {

    public Screen(){
        super(new BorderLayout());
        setBackground(Color.DARK_GRAY);
        setOpaque(true);
    }

    public void resize(){
        //TODO make it resize the same size as AppFrame size
        setSize(getParent().getSize());
    };
}
