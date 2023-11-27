package com.miri_and_donghak.makefriend.component.showMyFriends.components;

import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;

public class GoBack extends JPanel {
    private final FrameContainer frameContainer;
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    GoBack(FrameContainer frameContainer){
        this.frameContainer = frameContainer;

        setCursor(CursorUtil.customCursor());

        JButton goLobby = new JButton("메인으로 돌아가기");
        goLobby.addActionListener(l -> {
            frameContainer.onlyLobby();
        });

        add(goLobby);

        setPreferredSize(new Dimension(350, fullsize.height));
    }
}