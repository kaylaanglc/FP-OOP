package PacMan.src.PACMAN;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu extends JFrame{
    private JButton myButton;
    private JPanel panel1;
    public MyMenu() {
        setContentPane(panel1);
        setTitle("MENU");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == myButton){
                    PacMan pac = new PacMan();
                   pac.setVisible(true);
        pac.setTitle("PacMan");
        pac.setSize(380,435);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);

                }
            }
        });
    }
}


