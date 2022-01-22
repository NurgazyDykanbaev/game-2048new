package view;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(){

        GamePanel gamePanel = new GamePanel();

        this.add(gamePanel);

        this.setTitle("game 2048");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

