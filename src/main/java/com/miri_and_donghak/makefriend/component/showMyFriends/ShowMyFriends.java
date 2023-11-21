package com.miri_and_donghak.makefriend.component.showMyFriends;

import com.miri_and_donghak.makefriend.component.showMyFriends.CharacterList;
import com.miri_and_donghak.makefriend.util.ButtonUtil;
import com.miri_and_donghak.makefriend.util.CursorUtil;

import javax.swing.*;
import java.awt.*;

public class ShowMyFriends extends JFrame{
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();

    public ShowMyFriends(){
        JPanel lobby = new JPanel(new GridBagLayout());

        JButton makeFriendButton = ButtonUtil.createButton("공");
        JButton showMyFriend = ButtonUtil.createButton("사중");

        lobby.add(makeFriendButton);
        lobby.add(showMyFriend);
        lobby.setCursor(CursorUtil.customCursor());

        setTitle("동학이 친구 만들기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(fullsize);

        add(lobby);
        add(new CharacterList());
    }
}
