package com.miri_and_donghak.makefriend.component;

import com.miri_and_donghak.makefriend.component.panels.InitCharacterPanel;
import com.miri_and_donghak.makefriend.domain.service.CharcterService;
import com.miri_and_donghak.makefriend.util.ButtonUtil;
import com.miri_and_donghak.makefriend.util.CursorUtil;
import com.miri_and_donghak.makefriend.util.FontUtil;
import lombok.RequiredArgsConstructor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MakeFriend extends JFrame{
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public MakeFriend(){
        setCursor(CursorUtil.customCursor());

        add(BorderLayout.SOUTH ,new InitCharacterPanel());

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);
    }
}
