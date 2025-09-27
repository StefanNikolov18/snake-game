package gamepages;

import game.Game;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class GamePage {

    public GamePage(){
        game  = new Game();

        background = new JPanel(null);
        background.setBackground(Color.black);

        snakeHead = new JLabel();
        snakeHead.setBackground(Color.red);
        snakeHead.setBounds(100,100,20,20);
        snakeHead.setOpaque(true);

        background.add(snakeHead);


        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        snakeHead.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("UP"),"upAction");
        snakeHead.getActionMap().put("upAction",upAction);
        snakeHead.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        snakeHead.getActionMap().put("downAction",downAction);
        snakeHead.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        snakeHead.getActionMap().put("leftAction",leftAction);
        snakeHead.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        snakeHead.getActionMap().put("rightAction",rightAction);


        snakeHead.setFocusable(true);
        snakeHead.requestFocusInWindow();

    }

    public JPanel getGamePagePanel(){
        return background;
    }

    public JLabel getSnakeHead(){
        return snakeHead;
    }
    
    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            snakeHead.setLocation(snakeHead.getX(),snakeHead.getY() - 10);
            
        }
    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e){
            snakeHead.setLocation(snakeHead.getX(),snakeHead.getY() + 10);
        }
    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e){
            snakeHead.setLocation(snakeHead.getX() - 10,snakeHead.getY());
        }
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e){
             snakeHead.setLocation(snakeHead.getX() + 10,snakeHead.getY());
        }
    }




    private Action upAction;
    private Action downAction;
    private Action leftAction;
    private Action rightAction;

    JPanel background;
    JLabel snakeHead;
    private Game game;
}
