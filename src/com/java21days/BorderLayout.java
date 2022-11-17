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
        JButton[] jButtons = createButtons(buttons);
        JPanel panel = new JPanel();
        java.awt.BorderLayout layout = new java.awt.BorderLayout();
        panel.setLayout(layout);
        panel.add(jButtons[0], java.awt.BorderLayout.NORTH);
        panel.add(jButtons[1], java.awt.BorderLayout.SOUTH);
        panel.add(jButtons[2], java.awt.BorderLayout.EAST);
        panel.add(jButtons[3], java.awt.BorderLayout.WEST);
        add(panel);
        setVisible(true);
    }

    JButton[] createButtons(String[] buttons){
        JButton[] jButtons = new JButton[buttons.length];
        int i = 0;
        for( String text : buttons ){
            JButton btn = new JButton(text);
            jButtons[i] = btn;
            i++;
        }
        return jButtons;
    }

}
