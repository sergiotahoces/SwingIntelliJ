package Pruebas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app {
    private JButton button1;
    private JPanel panelMain;

    public app() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Probando Swing en IntelliJ");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("App");
        frame1.setContentPane(new app().panelMain);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
    }
}
