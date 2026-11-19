package view;

import shared.GameFont;

import javax.swing.*;
import java.awt.*;
import java.io.File;

//Aiden

//font code copied form my g11 project
public class GuiUtil {

    public static final Font PIXELFONT = loadCustomFont("Font/PressStart2P-Regular.ttf");
    public static Font PIXELFONTBIG = PIXELFONT.deriveFont(30f);
    public static Font PIXELFONTMEDIUM = PIXELFONT.deriveFont(20f);
    public static Font PIXELFONTSMALL = PIXELFONT.deriveFont(10f);
    public static Font loadCustomFont(String path) {
        try {
            // Create the font object from the file
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(path));

            // Register it so the JVM can handle it
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            // Return the font at the specific size you want
            return customFont;
        } catch (Exception e) {
            e.printStackTrace();
            // Fallback font if the file is missing
            return new Font("Arial", Font.BOLD, (int)10);
        }
    }

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
