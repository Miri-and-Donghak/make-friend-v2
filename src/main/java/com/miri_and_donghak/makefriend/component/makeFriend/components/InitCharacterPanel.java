package com.miri_and_donghak.makefriend.component.makeFriend.components;

import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.entity.Charcter;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class InitCharacterPanel extends JPanel {
    private final FrameContainer frameContainer;
    private Component parent;
    public static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    String[] gender = {"남자", "여자"};
    public InitCharacterPanel(FrameContainer frameContainer, Component parent){
        this.frameContainer = frameContainer;

        JLabel nameText = new JLabel("이름 :");
        JLabel genderText = new JLabel("성별 선택하기 :");
        JLabel ageText = new JLabel("나이 :");
        JLabel descriptionText = new JLabel("캐릭터 설명 :");
        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(120, 35));

        JTextField ageField = new JTextField();
        ageField.setPreferredSize(new Dimension(120, 35));

        JTextField descriptionField = new JTextField();
        descriptionField.setPreferredSize(new Dimension(500, 35));

        JComboBox<String> genderField = new JComboBox<>(gender);
        genderField.setPreferredSize(new Dimension(120, 35));

        JButton confirm = new JButton("캐릭터 저장하기");
        confirm.setPreferredSize(new Dimension(120, 55));
        confirm.addActionListener(l -> {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String gender = genderField.getSelectedIndex() == 0 ? "male" : "female";
            String description = descriptionField.getText();

            Charcter charcter = new Charcter();
            charcter.setName(name);
            charcter.setAge(age);
            charcter.setGender(gender);
            charcter.setDescription(description);

            frameContainer.addCharcterOnMakeFriend(charcter);
            System.out.println(frameContainer.getCharcterOnMakeFriend().getAge());
            System.out.println(frameContainer.getCharcterOnMakeFriend().getAccessories().get(0));
        });

        JButton goLobby = new JButton("메인으로 돌아가기");
        goLobby.setPreferredSize(new Dimension(120, 55));
        goLobby.addActionListener(l -> {
            frameContainer.onlyLobby();
        });

        add(genderText);
        add(genderField);
        add(nameText);
        add(nameField);
        add(ageText);
        add(ageField);
        add(descriptionText);
        add(descriptionField);
        add(goLobby);
        add(confirm);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        setBackground(Color.decode("#EDB1B1"));
        setBorder(new LineBorder(Color.decode("#F8DEDE"), 2, true));
        setVisible(true);
    }
}
