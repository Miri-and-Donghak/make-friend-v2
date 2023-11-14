package com.miri_and_donghak.makefriend.component;

import com.miri_and_donghak.makefriend.domain.service.CharcterService;
import com.miri_and_donghak.makefriend.util.ButtonUtil;
import com.miri_and_donghak.makefriend.util.CursorUtil;
import com.miri_and_donghak.makefriend.util.FontUtil;
import jakarta.persistence.Lob;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Lobby extends JFrame {
    private static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    private Image backgroundImage;

    public Lobby() {

        setTitle("동학이 친구 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        loadImage();

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

    private void loadImage() {
        try {
            URL image = getClass().getResource("/images/background.png");
            if (image != null) {
                backgroundImage = new ImageIcon(image).getImage();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private JPanel createButtons() {
        JButton makeFriendButton = ButtonUtil.createButton("친구 만들기");
        JButton showMyFriendButton = ButtonUtil.createButton("친구한테 가기");

        makeFriendButton.addActionListener(l -> {
            new MakeFriend();
            setVisible(false);
        });
        showMyFriendButton.addActionListener(l -> {
            new ShowMyFriends();
            setVisible(false);
        });

        JPanel buttons = new JPanel();

        buttons.add(makeFriendButton);
        buttons.add(showMyFriendButton);

        buttons.setBackground(new Color(0,0,0,0));

        return buttons;
    }
}
