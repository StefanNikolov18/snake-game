package gamepanel;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JFrame{ 
    
    private JButton playButton;
    private JButton exitButton;

    public GamePanel(){
         //Set icon
        ImageIcon icon = new ImageIcon("images/snakeIcon.png");
        this.setIconImage(icon.getImage());
        

        //Layer
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 600));

        //Background
        JLabel backgroundLabel = new JLabel(new ImageIcon(
            new ImageIcon("images/wallpaperMain.jpg").getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH)
        ));
        backgroundLabel.setBounds(0, 0, 800, 600);
        layeredPane.add(backgroundLabel, Integer.valueOf(-1)); // най-долния слой

        //Name
        JLabel nameGame = new JLabel("SNAKE GAME");
        nameGame.setFont(new Font("Big", Font.BOLD, 50));
        nameGame.setForeground(Color.BLACK);
        nameGame.setOpaque(false); // transparent
        nameGame.setBounds(225, 35, 400, 100);

        //set play button
        this.playButton = new JButton();
        playButton.setText("Play");
        playButton.setBounds(315, 215, 175, 60);
        playButton.setFont(new java.awt.Font("Commic Sans", java.awt.Font.BOLD, 25));
        playButton.setBackground(new Color(255, 255, 255));

        playButton.addActionListener(e -> {System.out.println("Play button pressed");
            //Start game
            //this.dispose();
            //Game game = new Game();
            //game.run();
        });

        playButton.setFocusable(false);
        playButton.setForeground(Color.BLACK);
        playButton.setBackground(Color.WHITE);
        playButton.setBorder(BorderFactory.createEtchedBorder());


        //set exit button
        this.exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setBounds(350, 300, 100, 50);
        exitButton.setFont(new java.awt.Font("Commic Sans", java.awt.Font.BOLD, 20));
        exitButton.setBackground(new Color(255, 255, 255));

        exitButton.addActionListener(e -> { System.exit(0);});

        exitButton.setFocusable(false);
        exitButton.setForeground(Color.BLACK);
        exitButton.setBackground(Color.WHITE);
        exitButton.setBorder(BorderFactory.createEtchedBorder());

        //List icon
        JLabel listIconLabel = new JLabel(new ImageIcon(
            new ImageIcon("images/List.png").getImage().getScaledInstance(400, 500, Image.SCALE_SMOOTH)
        ));
        listIconLabel.setBounds(180, 30, 400, 500);

        
        layeredPane.add(listIconLabel, Integer.valueOf(0));
        layeredPane.add(playButton, Integer.valueOf(1));
        layeredPane.add(exitButton, Integer.valueOf(2));
        layeredPane.add(nameGame, Integer.valueOf(3));
        
        
        

        //JFrame settings
        setTitle("Snake Game");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(new Color(0,130,0));
        this.add(layeredPane, BorderLayout.CENTER);


    }

}