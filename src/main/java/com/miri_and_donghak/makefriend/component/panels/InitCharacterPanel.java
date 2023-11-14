package com.miri_and_donghak.makefriend.component.panels;

import javax.swing.*;

public class InitCharacterPanel extends JPanel {
    public InitCharacterPanel(){
        JTextField nameField = new JTextField("이름");
        JTextField ageField = new JTextField("나이");
        JTextField genderField = new JTextField("성별");
        JTextField description = new JTextField("특징");

        add(nameField);
        add(ageField);
        add(genderField);
        add(description);

        setVisible(true);
    }
}
