import java.util.HashMap;

public class setZero {
    static void setZeroes(int[][] matrix) {
        int rl=matrix.length;
        int cl=matrix[0].length;
      //  int res[][]=new int[rl][cl];
        HashMap<Integer,Integer> row=new HashMap<>();
        HashMap<Integer,Integer> col=new HashMap<>();
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.put(i,1);
                    col.put(j,1);
                }
            }
        }
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(row.containsKey(i) || col.containsKey(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int x[]:matrix)
        {
            for(int z:x)
            {
                System.out.print(z+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{2,1,1},{1,1,0},{1,1,1}};
        setZeroes(arr);
    }
}
