package com.timers;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class TimersEx extends JFrame {

    private String boardName;

    public TimersEx(String boardName) {
        this.boardName = boardName;
        initUI();
    }

    private void initUI() {
        switch (boardName) {
            case "SwingTimer":
                add(new SwingTimerBoard());
                break;
            case "UtilityTimer":
                add(new UtilityTimerBoard());
                break;
            case "ThreadTimer":
                add(new ThreadTimerBoard());
                break;
            default:
                break;
        }

        setResizable(false);
        pack();

        setTitle("ipis");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            TimersEx ex = new TimersEx(args[0]);
            ex.setVisible(true);
        });
    }
}
