package com.matthew;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImageBoard extends JPanel {

    private Image image;

    public ImageBoard() {

        initBoard();
    }
    
    private void initBoard() {
        
        loadImage();
        
        int w = image.getWidth(this);
        int h =  image.getHeight(this);
        setPreferredSize(new Dimension(w, h));
        
        //setPreferredSize(new Dimension(getParent().frame.width, getParent().frame.height));
    }
    
    private void loadImage() {
        
        ImageIcon ii = new ImageIcon("images/roach.jpg");
        image = ii.getImage();
        
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(image, 0, 0, null);
    }
}
