package com.miri_and_donghak.makefriend.component.makeFriend.components;

import com.miri_and_donghak.makefriend.custom.LinearLayout;
import com.miri_and_donghak.makefriend.util.ImageUtil;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class AccessorieList extends JScrollPane {
    public AccessorieList()  {
        JPanel panel = new JPanel();
        panel.setLayout(new LinearLayout());
        panel.setBackground(Color.decode("#EDB1B1"));
        panel.setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));

        panel.add(createAccButton("cap"));
        panel.add(createAccButton("chicken"));
        panel.add(createAccButton("glasses"));
        panel.add(createAccButton("poop"));
        panel.add(createAccButton("ribbon"));
        panel.add(new JButton("----------"));
        panel.add(createHairButton("long"));
        panel.add(createHairButton("short"));

        setViewportView(panel);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        setBounds(50, 100, 50, 300);
        setPreferredSize(new Dimension(300, 400));
        setVisible(true);
    }

    private JButton createImageButton(String url){
        Image background = ImageUtil.loadImage(this, "makeCharacter/" + url);
        background = background.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon buttonImage = new ImageIcon(background);
        
        return new JButton(buttonImage);
    }

    private JButton createAccButton(String url){
        return createImageButton("accessories_" + url);
    }

    private JButton createHairButton(String url){
        return createImageButton("hairstyle_" + url);
    }
}
