package view;

import shared.GameFont;

import javax.swing.*;
import java.awt.*;

//Aiden
public class GuiUtil {
    public static JButton createButton(String text) { //since all buttons same, helper method here
        JButton button = new JButton(text);
        button.setFont(GameFont.get(16f));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(200, 55));
        button.setOpaque(true);
        button.setFocusable(false);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        return button;
    }

}
