package com.miri_and_donghak.makefriend.component.showMyFriends.components;

import com.miri_and_donghak.makefriend.component.makeFriend.components.ShowCharacter;
import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.util.ImageUtil;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ShowMyCharacter extends JPanel {
    public static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    String[] gender = {"남자", "여자"};
    public ShowMyCharacter(FrameContainer frameContainer){

        add(new ShowCharacter("hairstyle_long"));
        add(new ShowCharacter("character"));

        setLayout(new OverlayLayout(this));
        setBackground(Color.decode("#F7DBDB"));
        setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));
        setVisible(true);
    }
}
