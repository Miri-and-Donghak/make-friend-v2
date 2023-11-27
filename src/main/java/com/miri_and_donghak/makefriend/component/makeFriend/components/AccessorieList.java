package com.miri_and_donghak.makefriend.component.makeFriend.components;

import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.custom.LinearLayout;
import com.miri_and_donghak.makefriend.entity.enums.Accessories;
import com.miri_and_donghak.makefriend.util.ImageUtil;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class AccessorieList extends JScrollPane {
    private final FrameContainer frameContainer;
    public AccessorieList(FrameContainer frameContainer)  {
        this.frameContainer = frameContainer;

        JPanel panel = new JPanel();
        panel.setLayout(new LinearLayout());
        panel.setBackground(Color.decode("#EDB1B1"));
        panel.setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));

        ArrayList<JButton> accessorieList = new ArrayList<>();
        accessorieList.add(createAccButton("cap"));
        accessorieList.add(createAccButton("chicken"));
        accessorieList.add(createAccButton("glasses"));
        accessorieList.add(createAccButton("poop"));
        accessorieList.add(createAccButton("ribbon"));

        ArrayList<JButton> hairList = new ArrayList<>();
        hairList.add(createHairButton("long"));
        hairList.add(createHairButton("short"));

        panel.add(new JButton("~.~악세사리 선택~.~"));
        for(JButton i : accessorieList){
            panel.add(i);
        }

        panel.add(new JButton("~.~헤어스타ㅁ 선택~.~"));
        for(JButton i : hairList){
            panel.add(i);
        }

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

        JButton button = new JButton(buttonImage);
        button.addActionListener(l -> {
            System.out.println(url);
            frameContainer.getCharcterOnMakeFriend().addAccessories(Accessories.CHICKEN);
        });

        return button;
    }

    private JButton createAccButton(String url){
        return createImageButton("accessories_" + url);
    }

    private JButton createHairButton(String url){
        return createImageButton("hairstyle_" + url);
    }
}
