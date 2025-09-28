package gamepages;

import java.awt.*;
import javax.swing.*;

public class MenuPage{ 

    public MenuPage(GameFrame parent){
        this.parent = parent;

         //Layer interface
        this.layeredPane = new JLayeredPane();
        setLayersInStartMenu(layeredPane);
    }

    public JLayeredPane getLayeredPane(){
        return this.layeredPane;
    }
    
    public GameFrame getParent(){
        return this.parent;
    }

    //Menu layers creation
    private void setLayersInStartMenu(JLayeredPane layeredPane){

         //set dimentions
        layeredPane.setPreferredSize(new Dimension(800, 600));

        //set Background
        JLabel backgroundLabel = new JLabel(new ImageIcon("images/MenuPage/wallpaperMain.jpg"));
        backgroundLabel.setBounds(0, 0, 800, 600);

        //set play button
        JButton playButton = new JButton();
        playButton.setText("Play");
        playButton.setBounds(315, 215, 175, 60);
        playButton.setFont(new java.awt.Font("Commic Sans", java.awt.Font.BOLD, 25));
        playButton.setBackground(new Color(255, 255, 255));

        playButton.addActionListener(e -> parent.startGame());
    
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
        JLabel listIconLabel = new JLabel(new ImageIcon("images/MenuPage/List.png"));
        listIconLabel.setBounds(180, 30, 400, 500);

        //set Main text Snake Game name
        JLabel mainTextLabel = new JLabel(new ImageIcon("images/MenuPage/SnakeGameName.png"));
        mainTextLabel.setBounds(150, 0, 500, 150);
        
        //version text
        JLabel versionTextLabel = new JLabel("Version 1.0");
        versionTextLabel.setBounds(717, 540, 100, 20);
        versionTextLabel.setFont(new Font("Commic Sans",Font.BOLD, 12));
        versionTextLabel.setForeground(Color.WHITE);

        //stack layers
         layeredPane.add(backgroundLabel, Integer.valueOf(0)); //background
        layeredPane.add(listIconLabel, Integer.valueOf(1));//list
        layeredPane.add(mainTextLabel, Integer.valueOf(1)); //main text
        layeredPane.add(versionTextLabel, Integer.valueOf(1)); //version
        layeredPane.add(playButton, Integer.valueOf(2)); //play button
        layeredPane.add(exitButton, Integer.valueOf(2)); //exit button
        

    }

    //data
    private final GameFrame parent;
    private final JLayeredPane layeredPane;
}