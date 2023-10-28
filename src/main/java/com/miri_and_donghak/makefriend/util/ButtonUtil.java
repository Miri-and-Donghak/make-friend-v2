package com.miri_and_donghak.makefriend.util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonUtil {
    private static Dimension defaultButtonSize = new Dimension(300, 100);
    public static JButton createButton(String title){
        JButton button = new JButton(title);

        button.setPreferredSize(defaultButtonSize);
        button.setFont(FontUtil.getFonts());
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(new Color(0x663344));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(new Color(0x000000));
            }
        });

        return button;
    }
}
