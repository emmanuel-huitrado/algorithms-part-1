public class Site {
    private int x;
    private int y;
    private int value;
    private Status status;

    private Site(){
        this.x = 0;
        this.y = 0;

    }

    public Site(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.status = Status.CLOSED;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Site{" +
                "x=" + x +
                ", y=" + y +
                ", value=" + value +
                ", status=" + status +
                '}';
    }

    public boolean isCorner(int length) {
        return  (x == 0 && y == 0) || (x == length && y == length);
    }

    public Site rightNeighbour(Site[][] grid) {
        if(y != grid.length) {
            return new Site(x, y + 1, grid[x][y + 1].getValue());
        } else {
            return null;
        }
    }

    public Site leftNeighbour(Site[][] grid) {
        if(y != 0) {
            return new Site(x, y - 1, grid[x][y - 1].getValue());
        } else {
            return null;
        }
    }

    public Site upNeighbour(Site[][] grid) {
        if(x != 0) {
            return new Site(x - 1, y, grid[x - 1][y].getValue());
        } else {
            return null;
        }
    }

    public Site downNeighbour(Site[][] grid) {
        if(x != grid.length) {
            return new Site(x + 1, y, grid[x + 1][y].getValue());
        } else {
            return null;
        }
    }
}
