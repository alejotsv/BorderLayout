package com.java21days;

import javax.swing.*;
import java.awt.*;

public class BorderLayout extends JFrame {
    Dimension dim = new Dimension(400,400);

    BorderLayout(String title, String[] buttons){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setVisible(true);
    }

}
