import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DifficultyMenu extends JFrame {

    DifficultyMenu() {
        super("Snake Game");
        JLabel imageLabel= new JLabel();
        ImageIcon snakeImage= new ImageIcon("selectdifficulty.gif");
        imageLabel.setIcon(snakeImage);
        this.add(imageLabel);

        JButton easyButton = new JButton();
        ImageIcon easyB = new ImageIcon("easybutton.png");
        easyButton.setIcon(easyB);
        easyButton.setBounds(430, 170, 230, 49 );
        //2,north south 3,width 4,height
        imageLabel.add(easyButton);

        EventHandler easyHandler = new EventHandler(200);
        easyButton.addActionListener(easyHandler);
       

        JButton normalButton = new JButton();
        ImageIcon norB = new ImageIcon ("normalbutton.png");
        normalButton.setIcon(norB);
        normalButton.setBounds(430, 250, 230, 49 );
        imageLabel.add(normalButton);
        EventHandler mediumHandler = new EventHandler(100);
        normalButton.addActionListener(mediumHandler);


        JButton hardButton = new JButton();
        ImageIcon hardB = new ImageIcon ("normalbutton.png");
        hardButton.setIcon(hardB);
        hardButton.setBounds(430, 330, 230, 49 );
        imageLabel.add(hardButton);
        EventHandler hardHandler = new EventHandler(50);
        hardButton.addActionListener(hardHandler);

        JButton expertButton= new JButton();
        ImageIcon expertB = new ImageIcon ("normalbutton.png");
        expertButton.setIcon(expertB);
        expertButton.setBounds(430, 420, 230, 49 );
        imageLabel.add(expertButton);
        EventHandler expertHandler = new EventHandler(40);
        expertButton.addActionListener(expertHandler);
        
        

        JButton godmodeButton= new JButton();
        ImageIcon godmodeB = new ImageIcon ("normalbutton.png");
        expertButton.setIcon(godmodeB);
        expertButton.setBounds(430, 490, 230, 49 );
        imageLabel.add(godmodeButton);
        EventHandler godmodeHandler= new EventHandler(10);
        godmodeButton.addActionListener(godmodeHandler);
        
        
        
        // add(easyButton);
        // System.out.println("    \n");
        // add(mediumButton);
        // add(hardButton);
        // add(expertButton);
        // add(godmodeButton);

        
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100,650);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

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

            dispose();


        }
    }
}