package com.miri_and_donghak.makefriend.component.makeFriend;

import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.component.makeFriend.components.AccessorieList;
import com.miri_and_donghak.makefriend.component.makeFriend.components.InitCharacterPanel;
import com.miri_and_donghak.makefriend.component.makeFriend.components.ShowCharacterStatus;
import com.miri_and_donghak.makefriend.entity.enums.Accessories;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

public class MakeFriend extends JFrame{
    private final FrameContainer frameContainer;
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    private AccessorieList accessorieList;
    private ShowCharacterStatus showCharacterStatus;

    public MakeFriend(FrameContainer frameContainer) {
        this.frameContainer = frameContainer;

        accessorieList = new AccessorieList(frameContainer);
        showCharacterStatus = new ShowCharacterStatus(frameContainer);

        setCursor(CursorUtil.customCursor());

        add(BorderLayout.SOUTH, new InitCharacterPanel(frameContainer, this));
        add(BorderLayout.WEST, accessorieList);
        add(BorderLayout.CENTER, showCharacterStatus);

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);
    }

    public HashSet<Accessories> getAccessorieList() {
        return accessorieList.getAccessories();
    }

    public ShowCharacterStatus getShowCharacterStatus() {
        return showCharacterStatus;
    }
}
