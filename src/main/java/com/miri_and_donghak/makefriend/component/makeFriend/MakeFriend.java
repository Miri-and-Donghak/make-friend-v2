package com.miri_and_donghak.makefriend.component.makeFriend;

import com.miri_and_donghak.makefriend.custom.SwingContainer;
import com.miri_and_donghak.makefriend.component.makeFriend.components.AccessorieList;
import com.miri_and_donghak.makefriend.component.makeFriend.components.InitCharacterPanel;
import com.miri_and_donghak.makefriend.component.makeFriend.components.ShowCharacterStatus;
import com.miri_and_donghak.makefriend.domain.entity.Charcter;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MakeFriend extends JFrame{
    private final SwingContainer swingContainer;
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public ArrayList<Charcter> charcterList = new ArrayList<>();
    public MakeFriend(SwingContainer swingContainer) {
        this.swingContainer = swingContainer;

        setCursor(CursorUtil.customCursor());

        add(BorderLayout.SOUTH, new InitCharacterPanel(swingContainer, this));
        add(BorderLayout.WEST, new AccessorieList());
        add(BorderLayout.CENTER, new ShowCharacterStatus());

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);
    }

    public void addCharcter(Charcter charcter){
        charcterList.add(charcter);
    }

    public Charcter getCharcter(){
        return charcterList.get(0);
    }
}
