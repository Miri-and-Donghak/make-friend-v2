package com.miri_and_donghak.makefriend.component.makeFriend;

import com.miri_and_donghak.makefriend.component.custom.SwingContainer;
import com.miri_and_donghak.makefriend.component.makeFriend.AccessorieList;
import com.miri_and_donghak.makefriend.component.makeFriend.InitCharacterPanel;
import com.miri_and_donghak.makefriend.component.makeFriend.ShowCharacterStatus;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;
public class MakeFriend extends JFrame{
    private final SwingContainer swingContainer;
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public MakeFriend(SwingContainer swingContainer) {
        this.swingContainer = swingContainer;

        setCursor(CursorUtil.customCursor());

        add(BorderLayout.SOUTH, new InitCharacterPanel(swingContainer));
        add(BorderLayout.WEST, new AccessorieList());
        add(BorderLayout.CENTER, new ShowCharacterStatus());

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);
    }

}
