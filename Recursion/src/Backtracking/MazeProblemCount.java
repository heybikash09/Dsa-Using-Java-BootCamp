package Backtracking;

public class MazeProblemCount {
    static int MazeBackTracking(int row,int col)
    {
        if(row==1 || col==1)
            return 1;
        int left=MazeBackTracking(row-1,col);
        int right=MazeBackTracking(row,col-1);
        return left+right;
    }
    public static void main(String[] args) {
        System.out.println(MazeBackTracking(3,3));
    }
}
