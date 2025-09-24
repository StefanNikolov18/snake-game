package options;


public class StartPosOpt{
    public final int STARTING_ROW_SNAKE = new BoardOpt().MAX_ROWS / 2;
    public final int STARTING_COL_SNAKE = new BoardOpt().MAX_COLS / 4;

    public final int STARTING_ROW_APPLE = new BoardOpt().MAX_ROWS / 2;
    public final int STARTING_COL_APPLE = 3 * new BoardOpt().MAX_COLS / 4;
}