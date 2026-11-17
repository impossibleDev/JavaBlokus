package view;


import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

public class GameFont {
    private static Font baseFont;

    static {
        try (InputStream in = GameFont.class.getResourceAsStream("/fonts/PressStart2P.ttf")) {
            baseFont = Font.createFont(Font.TRUETYPE_FONT, in);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(baseFont);
        } catch (IOException | FontFormatException | NullPointerException e) {
            System.out.println("Font not found, using Arial");
            baseFont = new Font("Arial", Font.BOLD, 12);   //default
        }
    }

    public static Font get(float size) {
        return baseFont.deriveFont(size);
    }
}