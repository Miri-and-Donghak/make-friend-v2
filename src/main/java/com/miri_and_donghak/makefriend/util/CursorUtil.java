package com.miri_and_donghak.makefriend.util;

import java.awt.*;

public class CursorUtil {
    public static Cursor customCursor() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image cursorImage = tk.getImage("src/main/resources/images/cursor.png");
        Point point = new Point(0, 0);
        return tk.createCustomCursor(cursorImage, point, "customCursor");
    }
}
