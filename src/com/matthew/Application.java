package com.matthew;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {
    
    private String boardName;

    public Application(String boardName) {
        this.boardName = boardName;
        initUI();
    }

    private void initUI() {
        switch (boardName) {
            case "Green":
                add(new GreenBoard());
                break;
            case "Donut":
                add(new DonutBoard());
                break;
            case "Image":
                add(new ImageBoard());
                break;
            default:
                break;
        }

        setSize(330, 330);
        setTitle(boardName);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        //System.out.println(args[0]);
        EventQueue.invokeLater(() -> {
            Application ex = new Application(args[0]);
            ex.setVisible(true);
        });
    }
}
