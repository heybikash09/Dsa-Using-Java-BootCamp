public class MergeInterval {
    static  int[][] merge(int[][] intervals) {
        int row=intervals.length;
        int col=intervals[0].length;
        int res[][]=new int[row][col];
        int p=0;
        for(int i=0;i<row;i++)
        {
            boolean flag=false;
            if(intervals[i][0]==Integer.MAX_VALUE)
                continue;

            for(int j=i+1;j<col;j++)
            {
                if(intervals[i][1]-intervals[j][0]>=0)
                {
                    res[p][0]=intervals[i][0];
                    res[p][1]=intervals[j][1];
                    p++;
                    flag=true;
                    intervals[j][0]=Integer.MAX_VALUE;
                }
            }
            if(!flag)
            {
                res[p][0]=intervals[i][0];
                res[p][1]=intervals[i][1];
                p++;
            }
        }
        return res;

    }
    public static void main(String[] args) {
    int arr[][]={{1,3},{2,6},{8,10},{15,18},{8,12},{}};
    for(int x[]:merge(arr))
    {
        for(int z:x)
        {
            System.out.print(z+" ");
        }
        System.out.println();
    }
    }
}
