package com.miri_and_donghak.makefriend.component.showMyFriends;

import com.miri_and_donghak.makefriend.component.custom.SwingContainer;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;

public class GoBack extends JPanel {
    private final SwingContainer swingContainer;
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    GoBack(SwingContainer swingContainer){
        this.swingContainer = swingContainer;

        setCursor(CursorUtil.customCursor());

        JButton goLobby = new JButton("메인으로 돌아가기");
        goLobby.addActionListener(l -> {
            swingContainer.onlyLobby();
        });

        add(goLobby);

        setPreferredSize(new Dimension(350, fullsize.height));
    }
}