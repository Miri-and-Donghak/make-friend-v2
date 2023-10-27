package com.miri_and_donghak.makefriend.util;

import javax.swing.*;
import java.awt.*;

public class ButtonUtil {
    private static Dimension defaultButtonSize = new Dimension(250, 80);
    public static JButton createButton(String title){
        JButton button = new JButton(title);
        button.setPreferredSize(defaultButtonSize);
        button.setFont(FontUtil.getFonts());

        return button;
    }
}
