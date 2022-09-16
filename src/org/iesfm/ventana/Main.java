package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainpanel = new JPanel();

        f.setContentPane(mainpanel);

        JLabel namelabel = new JLabel("Nombre");

        namelabel.setForeground(Color.WHITE);

        mainpanel.add(namelabel);

        JTextField nameT = new JTextField(30);

        mainpanel.add(nameT);
        panel.add(label);

        f.setContentPane(panel);
    }
}
