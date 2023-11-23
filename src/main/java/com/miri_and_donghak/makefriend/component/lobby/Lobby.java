package com.miri_and_donghak.makefriend.component.lobby;

import com.miri_and_donghak.makefriend.component.custom.SwingContainer;
import com.miri_and_donghak.makefriend.component.makeFriend.MakeFriend;
import com.miri_and_donghak.makefriend.component.showMyFriends.ShowMyFriends;
import com.miri_and_donghak.makefriend.util.ButtonUtil;
import com.miri_and_donghak.makefriend.util.CursorUtil;
import com.miri_and_donghak.makefriend.util.ImageUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Lobby extends JFrame {
    private final SwingContainer swingContainer;
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    private Image backgroundImage;

    public Lobby(SwingContainer swingContainer){
        this.swingContainer = swingContainer;

        setTitle("동학이 친구 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        backgroundImage = ImageUtil.loadImage(this, "background");

        JPanel lobby = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, -200, 0, this);
                }
            }
        };

        lobby.setCursor(CursorUtil.customCursor());
        lobby.add(createButtons(), BorderLayout.SOUTH);


        add(lobby);
        setVisible(true);
    }

    private JPanel createButtons() {
        JButton makeFriendButton = ButtonUtil.createButton("친구 만들기");
        JButton showMyFriendButton = ButtonUtil.createButton("친구들 보기");

        makeFriendButton.addActionListener(l -> {
            swingContainer.onlyMakeFriend();
        });
        showMyFriendButton.addActionListener(l -> {
            swingContainer.onlyShowMyFriends();
        });

        JPanel buttons = new JPanel();

        buttons.add(makeFriendButton);
        buttons.add(showMyFriendButton);

        buttons.setBackground(new Color(0,0,0,0));

        return buttons;
    }
}
