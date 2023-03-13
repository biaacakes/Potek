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
        ImageIcon snakeImage= new ImageIcon("bgdraft.png");
        imageLabel.setIcon(snakeImage);
        this.add(imageLabel);

        JButton startButton = new JButton("start");
        ImageIcon startImageIcon = new ImageIcon("startgame.png");
        startButton.setIcon(startImageIcon);
        startButton.setBounds(540, 500, 250, 49);
        imageLabel.add(startButton);
        
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);
     
       
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100,700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //this.getContentPane().setBackground(new Color(237,241,214));
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

