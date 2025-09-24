package game;

import map.*;
import options.*;
import snake.Snake;

public class Game{


    public Game(){
        snake = new Snake();
        board = new Board();

        //Place starting positions
        StartPosOpt posOpt = new StartPosOpt();

        //Place snake on board
        board.setCellType
        (posOpt.STARTING_ROW_SNAKE, posOpt.STARTING_COL_SNAKE, Cell.CellType.SNAKE);

        //place apple on board
        board.setCellType
        (posOpt.STARTING_ROW_APPLE, posOpt.STARTING_COL_APPLE, Cell.CellType.APPLE);

    }

    public void run(){
        //game loop
        while(true){
            
        }
    }

    //private


    //data
    private Snake snake;
    private Board board;
}