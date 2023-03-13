import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
   

    MainMenu(){
        
        JLabel imageLabel= new JLabel();
        ImageIcon snakeImage= new ImageIcon("snakegif.gif");
        imageLabel.setIcon(snakeImage);
        this.add(imageLabel);

        JButton startButton = new JButton();
        ImageIcon startImageIcon = new ImageIcon("startgame.png");
        startButton.setIcon(startImageIcon);
        startButton.setBounds(430, 480, 248, 51);
        //2,north south 3,width 4,height
        imageLabel.add(startButton);
        
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);
     
       
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100,650);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);


    }
    // Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            // open game frame
            new DifficultyMenu();
            // Close main menu frame
            dispose();
        }
}
}