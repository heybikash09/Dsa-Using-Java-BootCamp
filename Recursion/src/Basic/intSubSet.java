package Basic;
/*  print all the subsetof  element of a integer array and store it in a arrayList */
import java.util.ArrayList;
import java.util.List;

public class intSubSet {
    static List<List<Integer>> subSetInt(int arr[]){
        ArrayList<List<Integer>> outer=new ArrayList<>();
            outer.add(new ArrayList<>());
            for(int num:arr)
            {
                int n=outer.size();
                    for(int i=0;i<n;i++)
                    {
                        List<Integer> internal=new ArrayList<>(outer.get(i));
                        internal.add(num);
                        outer.add(internal);
                    }
            }
            return outer;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3};
       for(List<Integer> z:subSetInt(arr))
        {
            System.out.println(z);
        }
    }
}
