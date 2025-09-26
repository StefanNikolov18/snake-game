package game;

import map.*;
import options.*;
import snake.Snake;

public class Game{


    public Game(){
        snake = new Snake();

        //Create board
        board = new Board(BoardOpt.MAX_ROWS,BoardOpt.MAX_COLS);

        //Place snake on board
        board.setCellType
        (StartPosOpt.STARTING_ROW_SNAKE, StartPosOpt.STARTING_COL_SNAKE, Cell.CellType.SNAKE);

        //place apple on board
        board.setCellType
        (StartPosOpt.STARTING_ROW_APPLE, StartPosOpt.STARTING_COL_APPLE, Cell.CellType.APPLE);

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
    private boolean isAlive;
}