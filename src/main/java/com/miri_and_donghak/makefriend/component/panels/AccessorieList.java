package com.miri_and_donghak.makefriend.component.panels;

import com.miri_and_donghak.makefriend.component.layout.LinearLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class AccessorieList extends JScrollPane {
    public AccessorieList(){
        JPanel panel = new JPanel();
        panel.setLayout(new LinearLayout());
        panel.setBackground(Color.decode("#EDB1B1"));
        panel.setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));
        for (int i = 0; i < 100; i++) {
            panel.add(new JButton("Hello-" + i));
        }

        setViewportView(panel);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        setBounds(50, 100, 50, 300);
        setPreferredSize(new Dimension(300, 400));
        setVisible(true);

        //setBackground(Color.decode("#EDB1B1"));
        //setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));
    }
}
