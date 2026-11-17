package view.overlay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import view.GameScreen;
import view.GameFont;

public class HelpPanelOverlay extends JPanel {

    public HelpPanelOverlay(GameScreen frame) {//should be add in game screen
        setLayout(new BorderLayout());
        setOpaque(true);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        setPreferredSize(new Dimension(600, 400));   

        //title
        JLabel title = new JLabel("BLOKUS", SwingConstants.CENTER);
        title.setFont(GameFont.get(32f));

        JButton close = new JButton("X");
        close.setFont(GameFont.get(20f));
        //close.addActionListener(e -> frame.closeOverlay()); //should be add in gamescreen

        JPanel top = new JPanel(new BorderLayout());
        top.setOpaque(false);
        top.add(title, BorderLayout.CENTER);
        top.add(close, BorderLayout.EAST);
        add(top, BorderLayout.NORTH);

        //content
        JTextArea text = new JTextArea(loadHelpText());
        text.setFont(GameFont.get(12f));
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setMargin(new java.awt.Insets(8, 8, 8, 8));

        JScrollPane scroll = new JScrollPane(text);
        add(scroll, BorderLayout.CENTER);
    }

    private String loadHelpText() {
        return "How to Play\n\nBLOKUS is a 4-player game...";   
    }
}