import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyMenu extends JFrame {

    DifficultyMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        ImageIcon bg = new ImageIcon ("500 (3).png ");
        JLabel bgJLabel = new JLabel();
        bgJLabel.setIcon(bg);
       // bgJLabel.setHorizontalAlignment(JLabel.RIGHT);
        //  this.add(label);
        this.add(bgJLabel);

        // ImageIcon icon = new ImageIcon ("selectdiff.png ");
        // JLabel label= new JLabel();
        // label.setIcon(icon);

        JButton easyButton = new JButton();
        ImageIcon easyB = new ImageIcon ("easybutton.png");
        
        easyButton.setIcon(easyB);
        easyButton.setForeground(Color.WHITE);
        easyButton.setBackground(null);
        easyButton.setBorder(null);
        easyButton.setLocation(2050,600);
        easyButton.setHorizontalAlignment(JButton.RIGHT);
        
        //easyButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        //easyButton.setBackground(new Color(128,70,116));
        EventHandler easyHandler = new EventHandler(200);
        //Add event to easy button
        easyButton.addActionListener(easyHandler);
        easyButton.setText("easy");
       

        JButton mediumButton = new JButton();
        // mediumButton.setText("Medium");
        ImageIcon medB = new ImageIcon ("normalbutton.png");
        mediumButton.setForeground(Color.WHITE);
        mediumButton.setIcon(medB);
        mediumButton.setBackground(null);
        mediumButton.setBorder(null);
      //  mediumButton.setVerticalAlignment(JButton.RIGHT);

       // mediumButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
      //  mediumButton.setBackground(new Color(128,70,116));
        EventHandler mediumHandler = new EventHandler(100);
        mediumButton.addActionListener(mediumHandler);


        JButton hardButton = new JButton();
        hardButton.setText("Hard");
        hardButton.setForeground(Color.WHITE);
        hardButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        hardButton.setBackground(new Color(128,70,116));
        EventHandler hardHandler = new EventHandler(50);
        hardButton.addActionListener(hardHandler);

        JButton expertButton= new JButton();
        expertButton.setText("Expert");
        expertButton.setForeground(Color.WHITE);
        expertButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        expertButton.setBackground(new Color(128,70,116));
        EventHandler handler3 = new EventHandler(40);
        expertButton.addActionListener(handler3);
        
        

        JButton godmodeButton= new JButton();
        godmodeButton.setText("God Mode");
        godmodeButton.setForeground(Color.WHITE);
        godmodeButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        godmodeButton.setBackground(new Color(128,70,116));
        EventHandler handler4= new EventHandler(10);
        godmodeButton.addActionListener(handler4);
        
        
       
        add(easyButton);
        System.out.println("    \n");
        add(mediumButton);
        add(hardButton);
        add(expertButton);
        add(godmodeButton);

        
        //Close java program when using window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Dimension of frame
        this.setSize(1100,700);
        //Makes frame appear on screen
        this.setVisible(true);
        //Set fram to center
        this.setLocationRelativeTo(null);
        //Set background color of frame
        this.getContentPane().setBackground(new Color(237,241,214));

       // this.setResizable(false);

    }

    private class EventHandler implements ActionListener {

        int snakeSpeed;
        EventHandler (int speed) {
            this.snakeSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {
            Board gp = new Board();
            
            gp.DELAY = snakeSpeed;
        
            new ColorMenu();


        }
    }
}