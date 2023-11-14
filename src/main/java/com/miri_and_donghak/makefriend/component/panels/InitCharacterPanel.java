package com.miri_and_donghak.makefriend.component.panels;

import com.miri_and_donghak.makefriend.domain.entity.dto.InitCharcterRequest;
import com.miri_and_donghak.makefriend.domain.service.CharcterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.swing.*;
import java.awt.*;

@Controller
public class InitCharacterPanel extends JPanel {
    @Autowired
    private CharcterService charcterService;

    public static Dimension fullsize = Toolkit.getDefaultToolkit().getScreenSize();
    String[] gender = {"남자", "여자"};
    public InitCharacterPanel(){
        JTextField nameField = new JTextField("이름");
        nameField.setPreferredSize(new Dimension(120, 35));

        JTextField ageField = new JTextField("나이");
        ageField.setPreferredSize(new Dimension(120, 35));

        JTextField descriptionField = new JTextField("설명");
        descriptionField.setPreferredSize(new Dimension(120, 35));

        JComboBox<String> genderField = new JComboBox<>(gender);
        genderField.setPreferredSize(new Dimension(120, 35));

        JButton confirm = new JButton("캐릭터 저장하기");
        confirm.setPreferredSize(new Dimension(120, 55));

        confirm.addActionListener(l -> {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String gender = genderField.getSelectedIndex() == 0 ? "male" : "female";
            String description = descriptionField.getText();

            System.out.println(name);
            System.out.println(gender);
//            charcterService.initCharcter(new InitCharcterRequest(name, age, gender, description));

            System.out.println(name);
        });

        add(genderField);
        add(nameField);
        add(ageField);
        add(descriptionField);
        add(confirm);

        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 30));
        setBackground(Color.PINK);
        setVisible(true);
    }
}
