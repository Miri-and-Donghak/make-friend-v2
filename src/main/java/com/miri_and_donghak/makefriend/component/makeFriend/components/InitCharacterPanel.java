package com.miri_and_donghak.makefriend.component.makeFriend.components;

import com.miri_and_donghak.makefriend.custom.FrameContainer;
import com.miri_and_donghak.makefriend.entity.Character;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class InitCharacterPanel extends JPanel {
    private final FrameContainer frameContainer;
    private Component parent;
    public static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    String[] genders = {"남자", "여자"};

    String name;
    int age;
    String gender;
    String description;
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

        JComboBox<String> genderField = new JComboBox<>(genders);
        genderField.setPreferredSize(new Dimension(120, 35));

        JButton confirm = new JButton("캐릭터 저장하기");
        confirm.setPreferredSize(new Dimension(120, 55));
        confirm.addActionListener(l -> {
            name = nameField.getText();
            age = Integer.parseInt(ageField.getText());
            gender = genderField.getSelectedIndex() == 0 ? "male" : "female";
            description = descriptionField.getText();

            Character character = new Character(age, gender, description);
            character.setAccessories(frameContainer.getCharacterAccessorie());

            frameContainer.addCharacter(character, name);

            Character test = frameContainer.findCharacterByName(name);
            System.out.println(test.toString());
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

    @Override
    public String getName() {
        return name;
    }
}
