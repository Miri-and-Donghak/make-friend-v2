package com.miri_and_donghak.makefriend.component.showMyFriends;

import com.miri_and_donghak.makefriend.custom.SwingContainer;
import com.miri_and_donghak.makefriend.component.showMyFriends.components.CharacterList;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;

public class ShowMyFriends extends JFrame{
    private final SwingContainer swingContainer;
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public ShowMyFriends(SwingContainer swingContainer){
        this.swingContainer = swingContainer;

        add(new CharacterList(swingContainer));

        setCursor(CursorUtil.customCursor());
        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);
    }
}