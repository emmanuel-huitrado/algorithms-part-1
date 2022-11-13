import java.util.Arrays;

public class Main {
    private static Site[][] grid;

    public static void generate(int n){
        int counter = 1;
        grid = new Site[n][n];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = new Site(i, j, counter++);
            }
        }
    }

    public static void main(String[] args) {
        generate(3);
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j].getValue() + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Right neighbour of: " + grid[1][1].getValue() + " - " + grid[1][1].rightNeighbour(grid));
        System.out.println("Left neighbour of: " + grid[1][1].getValue() + " - " + grid[1][1].leftNeighbour(grid));
        System.out.println("Up neighbour of: " + grid[1][1].getValue() + " - " + grid[1][1].upNeighbour(grid));
        System.out.println("Down neighbour of: " + grid[1][1].getValue() + " - " + grid[1][1].downNeighbour(grid));
    }
}
