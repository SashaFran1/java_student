package ru.gb.radyuk;

import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {

    Frame() {
        setTitle("Chat");
        setSize(new Dimension(400, 400));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        TextArea bigTextPanel = new TextArea();
        SendPanel sendPanel = new SendPanel(bigTextPanel.getTextArea());

        add(bigTextPanel, BorderLayout.CENTER);
        add(sendPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
