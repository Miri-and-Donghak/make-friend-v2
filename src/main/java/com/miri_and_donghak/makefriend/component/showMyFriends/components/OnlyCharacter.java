package com.miri_and_donghak.makefriend.component.showMyFriends.components;

import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.entity.Character;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;

public class OnlyCharacter extends JPanel {
    private final FrameContainer frameContainer;
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    OnlyCharacter(String name, Character character, FrameContainer frameContainer){
        this.frameContainer = frameContainer;

        setCursor(CursorUtil.customCursor());
        add(new Button(name));
        add(new ShowMyCharacter(frameContainer));
//        add(new Button(character.getDescription()));
        System.out.println(character);
        setPreferredSize(new Dimension(350, fullsize.height));
    }
}
