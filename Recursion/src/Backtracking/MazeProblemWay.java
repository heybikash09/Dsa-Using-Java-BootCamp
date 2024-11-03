package Backtracking;

public class MazeProblemWay {
    static void MazeFun(String set,int row,int col)
    {
            if(row==1 && col==1)
            {
                System.out.println(set);
                return ;
            }
            if(row>1)
                MazeFun(set+'D',row-1,col);
            if(col>1)
                MazeFun(set+'R',row,col-1);
    }
    static void MazeWithDiagonalMove(String set,int row,int col)
    {
        if(row==1 && col==1)
        {
            System.out.println(set);
            return ;
        }
        if(col>1 && row>1)
            MazeWithDiagonalMove(set+'V',row-1,col-1);
        if(row>1)
            MazeFun(set+'D',row-1,col);
        if(col>1)
            MazeFun(set+'R',row,col-1);
    }

    public static void main(String[] args) {

        MazeFun("",3,3);
        MazeWithDiagonalMove("",3,3);
    }
}
