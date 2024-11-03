import java.util.*;
public class spiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix)
    {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
            row.add(i);
        for(int i=0;i<matrix[0].length;i++)
            col.add(i);
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(!row.isEmpty() || !col.isEmpty())
        {
            while(col.contains(j) && !row.isEmpty() && !col.isEmpty())
            {
                res.add(matrix[i][j]);
                j++;
            }
            row.remove(i);i++;j--;
            while(row.contains(i) && !row.isEmpty() && !col.isEmpty())
            {
                res.add(matrix[i][j]);i++;
            }
            col.remove(j);
            j--;i--;
            while(col.contains(j) && !row.isEmpty() && !col.isEmpty())
            {
                res.add(matrix[i][j]);j--;
            }
            row.remove(i);i--;j++;
            while(row.contains(i) && !row.isEmpty() && !col.isEmpty())
            {
                res.add(matrix[i][j]);i--;
            }
            col.remove(j);i++;j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{34,35,36,37}};
        for(int x[]:mat)
        {
            for(int z:x)
                System.out.print(z+"  ");
            System.out.println();
        }
        System.out.println(spiralOrder(mat));
    }
}
