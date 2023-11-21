package com.miri_and_donghak.makefriend.component.showMyFriends;

import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;

class OnlyCharacter extends JPanel {
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    OnlyCharacter(){
        setCursor(CursorUtil.customCursor());
        add(new Button("왓"));
        add(new Button("의미"));

        setPreferredSize(new Dimension(350, fullsize.height));
    }
}
