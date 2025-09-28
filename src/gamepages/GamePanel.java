package gamepages;

import java.awt.*;
import javax.swing.*;
import options.BoardOpt;

public class GamePanel extends JPanel{
    
    public GamePanel(){
        board = new int[BoardOpt.MAX_ROWS][BoardOpt.MAX_COLS];
        board[10][5] = 1;
        board[10][15] = 2;

        setLayout(null);
        setBackground(Color.BLACK);
        background = new ImageIcon("images/GamePage/gamePageBackground.jpg").getImage();
        woodenBoard = new ImageIcon("images/GamePage/woodenBoard.png").getImage();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //background
        g2d.drawImage(background,0,0,null);

        //wooden board
        g2d.drawImage(woodenBoard,165,55,null);
        

        //draw board
        int rows = BoardOpt.MAX_ROWS;
        int cols = BoardOpt.MAX_COLS;
        int cellSize = 20;

        int boardWidth = cols * cellSize;   // 400
        int boardHeight = rows * cellSize;  // 400

        int startX = (getWidth() - boardWidth) / 2;   //(800 - 400) / 2
        int startY = (getHeight() - boardHeight) / 2; // (600 - 400) / 2

         for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
            int x = startX + col * cellSize;
            int y = startY + row * cellSize;

            // фон на клетката
            g2d.setColor(Color.BLUE);
            g2d.fillRect(x, y, cellSize, cellSize);

            // съдържание (змия или ябълка)
            int value = board[row][col];
            if (value == 1) { // змия
                g2d.setColor(Color.GREEN);
                g2d.fillRect(x, y, cellSize, cellSize);
            } else if (value == 2) { // ябълка
                g2d.setColor(Color.RED);
                g2d.fillOval(x, y, cellSize, cellSize);
            }

            // мрежата (черна рамка на клетките)
            g2d.setColor(Color.BLACK);
            g2d.drawRect(x, y, cellSize, cellSize);
        }
    }



    }

    //data
    Image background;
    Image woodenBoard;
    private int[][] board; //0 - empty, 1 - snake, 2 - apple
}
