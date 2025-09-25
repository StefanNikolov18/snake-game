package gamepanel;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JFrame{ 

    public GamePanel(){
        //Set icon
        setIconGame();

        //JFrame settings
        setTitle("Snake Game");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

         //Layer interface
        JLayeredPane layeredPane = new JLayeredPane();
        setLayersInStartMenu(layeredPane);

        setVisible(true);
        setResizable(false);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(0,130,0));
        
        this.add(layeredPane, BorderLayout.CENTER);
        
    }

    private void setIconGame(){
        ImageIcon icon = new ImageIcon("images/snakeIcon.png");
        this.setIconImage(icon.getImage());
    }

    private void setLayersInStartMenu(JLayeredPane layeredPane){

         //set dimentions
        layeredPane.setPreferredSize(new Dimension(800, 600));

        //set Background
        JLabel backgroundLabel = new JLabel(new ImageIcon("images/wallpaperMain.jpg"));
        backgroundLabel.setBounds(0, 0, 800, 600);
        layeredPane.add(backgroundLabel, Integer.valueOf(-1)); // най-долния слой

        //set play button
        JButton playButton = new JButton();
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

        //set exit button
        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setBounds(350, 300, 100, 50);
        exitButton.setFont(new java.awt.Font("Commic Sans", java.awt.Font.BOLD, 20));
        exitButton.setBackground(new Color(255, 255, 255));

        exitButton.addActionListener(e -> { System.exit(0);});

        exitButton.setFocusable(false);
        exitButton.setForeground(Color.BLACK);
        exitButton.setBackground(Color.WHITE);

        //List icon
        JLabel listIconLabel = new JLabel(new ImageIcon("images/List.png"));

        listIconLabel.setBounds(180, 30, 400, 500);


        //set Main text Snake Game name
        JLabel mainTextLabel = new JLabel(new ImageIcon("images/SnakeGameName.png"));
        mainTextLabel.setBounds(150, 0, 500, 150);
        
        //stack layers
        layeredPane.add(listIconLabel, Integer.valueOf(0));
        layeredPane.add(playButton, Integer.valueOf(1));
        layeredPane.add(exitButton, Integer.valueOf(2));
        layeredPane.add(mainTextLabel, Integer.valueOf(4));
    }

}