package gr.aueb.cf.ch21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CFrame extends JFrame {

    public CFrame() {
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Coding Factory");

        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);

        JButton btn = new JButton("Warning Button");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.WARNING_MESSAGE);
            }
        });

        contentPane.add(btn);
    }
}
