import java.util.HashMap;

public class LongestSubArrayWithSumK {
    static int FindLongSubArr(int[] A,int N,int K)
    {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int length = 0;
        int sum = 0;
        hm.put(0,-1);
        for(int i=0;i<N;i++){
            sum = sum + A[i];
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
            if(hm.containsKey(sum-K)) {
                if (i - hm.get(sum - K) > length) {
                    length = i - hm.get(sum - K);
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int arr[]={-13, 0, 6, 9, 16};
        int n=arr.length;
        int k=15;
        System.out.println("The Longest sub Array is "+FindLongSubArr(arr,n,k));
    }
}
