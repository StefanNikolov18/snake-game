package gamepanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GamePanel extends JFrame implements ActionListener{ 
    
    private JButton playButton;

    public GamePanel(){
         //Set icon
        ImageIcon icon = new ImageIcon("images/snakeMainBadge.png");
        this.setIconImage(icon.getImage());
        

        //set button
        this.playButton = new JButton();
        playButton.setText("Play");
        playButton.setBounds(300, 200, 200, 50);
        playButton.setFont(new java.awt.Font("Commic Sans", java.awt.Font.BOLD, 25));
        playButton.setBackground(new Color(255, 255, 255));
        playButton.addActionListener(this);
        playButton.setFocusable(false);
        playButton.setHorizontalTextPosition(JButton.CENTER);
        playButton.setVerticalTextPosition(JButton.CENTER);
        playButton.setForeground(Color.BLACK);
        playButton.setBackground(Color.WHITE);
        playButton.setBorder(BorderFactory.createEtchedBorder());

        


        setTitle("Snake Game");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        this.setLayout(null);
        this.add(playButton,BorderLayout.CENTER);
        this.getContentPane().setBackground(new Color(51,153,255));

    }


        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == playButton){

                System.out.println("Play button pressed");
                //Start game
               // this.dispose();
                //Game game = new Game();
                //game.run();
            }
        }
}