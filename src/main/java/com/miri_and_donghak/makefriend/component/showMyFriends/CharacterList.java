package com.miri_and_donghak.makefriend.component.showMyFriends;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CharacterList extends JScrollPane{
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    public CharacterList()  {

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.decode("#EDB1B1"));
        panel.setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));
        for(int i = 1; i <= 10; i++) panel.add(new TestTextPanel());

        setViewportView(panel);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        setBounds(50, 100, 50, 300);
        setPreferredSize(new Dimension(300, 400));
        setVisible(true);
    }
}

class TestTextPanel extends JPanel {
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    TestTextPanel(){
        add(new Button("왓"));
        add(new Button("의미"));

        setPreferredSize(new Dimension(350, fullsize.height));
    }
}
