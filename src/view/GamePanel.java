package view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel(){
        this.setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int size = 400;
        int titleSize = size / 4;

        int x = (this.getWidth() - size)/2;
        int y = (this.getHeight() - size)/2;

        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(x,y,size,size,15,15);

        g.setColor(Color.BLACK);
        for (int row = y; row < size + y ; row += titleSize) {
            for (int col = x; col < size + x; col += titleSize) {
                g.drawRect(col,row,titleSize,titleSize);
            }
        }
    }
}

