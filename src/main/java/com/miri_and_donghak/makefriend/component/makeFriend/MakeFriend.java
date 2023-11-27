package com.miri_and_donghak.makefriend.component.makeFriend;

import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.component.makeFriend.components.AccessorieList;
import com.miri_and_donghak.makefriend.component.makeFriend.components.InitCharacterPanel;
import com.miri_and_donghak.makefriend.component.makeFriend.components.ShowCharacterStatus;
import com.miri_and_donghak.makefriend.entity.Character;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MakeFriend extends JFrame{
    private final FrameContainer frameContainer;
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public ArrayList<Character> characterList = new ArrayList<>();
    public MakeFriend(FrameContainer frameContainer) {
        this.frameContainer = frameContainer;

        setCursor(CursorUtil.customCursor());

        add(BorderLayout.SOUTH, new InitCharacterPanel(frameContainer, this));
        add(BorderLayout.WEST, new AccessorieList(frameContainer));
        add(BorderLayout.CENTER, new ShowCharacterStatus());

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);
    }

    public void addCharcter(Character character){
        if(characterList == null) characterList = new ArrayList<>();
        characterList.add(character);
    }

    public Character getCharcter(){
        return characterList.get(0);
    }
}
