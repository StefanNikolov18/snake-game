package gamepages;

import game.Game;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class GamePage implements ActionListener{

    public GamePage(){
        game  = new Game();

        gamePanel = new GamePanel();
        //gamePanel.setBackground(Color.green);

        snakeHead = new JLabel();
        snakeHead.setBackground(Color.red);
        snakeHead.setBounds(100,100,20,20);
        snakeHead.setOpaque(true);

        gamePanel.add(snakeHead);


        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        //set up upkeystroke
        snakeHead.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW). 
        put(KeyStroke.getKeyStroke("UP"),"upAction");
        snakeHead.getActionMap().put("upAction",upAction);

        //set up downkeystroke
        snakeHead.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
        put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        snakeHead.getActionMap().put("downAction",downAction);

         //set up leftkeystroke
        snakeHead.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
        put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        snakeHead.getActionMap().put("leftAction",leftAction);

         //set up rightkeystroke
        snakeHead.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
        put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        snakeHead.getActionMap().put("rightAction",rightAction);

        //focusing head
        snakeHead.setFocusable(true);
        snakeHead.requestFocusInWindow();

    }

    public JPanel getGamePagePanel(){
        return gamePanel;
    }

    public JLabel getSnakeHead(){
        return snakeHead;
    }
    
    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            snakeHead.setLocation(snakeHead.getX(),snakeHead.getY() - 20);
            if(!game.goUp())
                isDead = true;
        }
    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e){
            snakeHead.setLocation(snakeHead.getX(),snakeHead.getY() + 20);
            if(!game.goDown())
                isDead = true;
        }
    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e){
            snakeHead.setLocation(snakeHead.getX() - 20,snakeHead.getY());
            if(!game.goLeft())
                isDead = true;
        }
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e){
             snakeHead.setLocation(snakeHead.getX() + 20,snakeHead.getY());
             if(!game.goRight())
                isDead = true;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e){
        
    }



    private Action upAction;
    private Action downAction;
    private Action leftAction;
    private Action rightAction;

    GamePanel gamePanel;
    JLabel snakeHead;
    private Game game;
    private boolean isDead = false;
}
