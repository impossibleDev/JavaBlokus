package view.overlay;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import view.GuiUtil;

public class HelpPanelOverlay extends Overlay {
    public HelpPanelOverlay() {
        super();
        setPreferredSize(new Dimension(700, 500));
        setLayout(new BorderLayout());
        setOpaque(true);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        //title
        JLabel title = new JLabel("BLOKUS", SwingConstants.CENTER);
        title.setFont(GuiUtil.PIXELFONTBIG);
        JButton close = new JButton("X");
        close.setFont(GuiUtil.PIXELFONTMEDIUM);
        close.addActionListener(e -> {
            if (getParent() != null) {
                getParent().remove(this);
                getParent().revalidate();
                getParent().repaint();
            }
        });
        JPanel top = new JPanel(new BorderLayout());
        top.setOpaque(false);
        top.add(title, BorderLayout.CENTER);
        top.add(close, BorderLayout.EAST);
        add(top, BorderLayout.NORTH);
        //content
        JTextArea text = new JTextArea(loadHelpText());
        text.setFont(GuiUtil.PIXELFONTMEDIUM);
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setMargin(new java.awt.Insets(8, 8, 8, 8));
        JScrollPane scroll = new JScrollPane(text);
        add(scroll, BorderLayout.CENTER);
    }

    //Instruction on the Help Panel
    private String loadHelpText() {
        return """
   How to Play
   BLOKUS is a 4-player game where the ultimate objective is to have as many blocks on the board as possible. Each player chooses a colour that corresponds to their blocks.
   Each player’s first block must touch the corner of the board. Each block after must touch another block of the same colour at the corners only. Blocks of different colours can touch at the edges freely. While dragging a block, press R to rotate it or F to flip it. The winner is determined by whichever player has the fewest leftover squares in unused blocks after no more blocks can be placed.
   FAQ
   Q: What happens if I have no legal moves left?
   A: You’re skipped for the rest of the game, but play continues for the remaining players.
   Q: Can I pass my turn voluntarily?
   A: No, you can only be skipped when you truly have no legal moves left.
   Q: How is my final score calculated?
   A: Your score is based on the number of squares left in your unused blocks. Fewer leftover squares means a higher score.
   Q: When does the game officially end?
   A: When none of the remaining players can place any more blocks.
   Contact Us!
   349722660@gapps.yrdsb.ca
   350777603@gapps.yrdsb.ca
   440016206@gapps.yrdsb.ca
   """;
    }
}
