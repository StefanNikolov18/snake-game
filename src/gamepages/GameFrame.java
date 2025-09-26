package gamepages;

import java.awt.*;
import javax.swing.*;
import options.FrameDim;

public class GameFrame extends JFrame{
    
    private MenuPage menuPage;
    private LoadingPage loadingPage;

    private GamePage gamePage;


    public GameFrame(){
        //Set icon
        setIconGame();

        //JFrame settings
        setTitle("Snake Game");
        setSize(FrameDim.X_SIZE_FRAME,FrameDim.Y_SIZE_FRAME); //800x600
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuPage = new MenuPage(this);
        
        setVisible(true);
        setResizable(false);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(0,130,0)); //green background

        this.showMenu();

    }

    
    public void showMenu(){
        this.getContentPane().removeAll();
        this.add(menuPage.getLayeredPane(), BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    public void startGame(){

        showLoadingPage(); //loading page show
 
        loadGame(); //load game

        Timer loadingTime = new Timer(2000,  //timer for better experience
                e -> { 
                ((Timer)e.getSource()).stop();  
                showGamePanel(); //PLAY
            }
        );
        loadingTime.setRepeats(false);
        loadingTime.start();

        
    }

    private void loadGame(){
        gamePage = new GamePage();
    }

    private void showGamePanel(){
        this.getContentPane().removeAll();
        //this.add(gamePanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

     private void showLoadingPage(){
        this.getContentPane().removeAll();
        loadingPage = new LoadingPage();
        this.add(loadingPage.getLoadingPanel(), BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }


     private void setIconGame(){
        ImageIcon icon = new ImageIcon("images/snakeIcon.png");
        this.setIconImage(icon.getImage());
    }

}