package map;

public class Cell{
    public enum CellType{
        EMPTY,
        SNAKE,
        APPLE
    }

   //constructors
    public Cell(){
        this(0,0,CellType.EMPTY);
    }

    public Cell(int row, int col, CellType type) {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    public Cell(int row, int col) {
        this(row,col,CellType.EMPTY);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + row;
        result = prime * result + col;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cell other = (Cell) obj;
        if (row != other.row)
            return false;
        if (col != other.col)
            return false;
        if (type != other.type)
            return false;
        return true;
    }


    //getters
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public CellType getType() {
        return type;
    }

    //setter
    public void setType(final CellType type) {
        this.type = type;
    }

    //data
    private final int row,col;
    private CellType type;
}