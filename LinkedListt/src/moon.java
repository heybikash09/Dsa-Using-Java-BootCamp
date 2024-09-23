public class moon {
    public static void main(String[] args) {
  int arr[]={2,4,6,8,10};
  int sum=0;
  for(int i=1;i<arr.length;i+=2)
  {
      sum+=arr[i];
  }
        System.out.println(sum);
    }
}