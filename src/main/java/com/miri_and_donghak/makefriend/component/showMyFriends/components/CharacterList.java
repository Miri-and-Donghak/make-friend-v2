package com.miri_and_donghak.makefriend.component.showMyFriends.components;

import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.entity.Character;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterList extends JScrollPane{
    private final FrameContainer frameContainer;
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    public CharacterList(FrameContainer frameContainer){
        this.frameContainer = frameContainer;

        setCursor(CursorUtil.customCursor());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.decode("#EDB1B1"));
        panel.setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));
        panel.add(new GoBack(frameContainer));

        HashMap<String, Character> characters = frameContainer.findAllCharacter();
        for (Map.Entry<String, Character> entry : characters.entrySet()) {
            String key = entry.getKey();
            Character value = entry.getValue();
            panel.add(new OnlyCharacter(key, value, frameContainer));
        }

        setViewportView(panel);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        setBounds(50, 100, 50, 300);
        setPreferredSize(new Dimension(300, 400));
        setVisible(true);
    }
}

