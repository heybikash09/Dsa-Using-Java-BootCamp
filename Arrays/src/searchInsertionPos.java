public class searchInsertionPos {
    static int searchInsert(int[] nums, int target) {
        int l= 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l +r)/ 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        System.out.println("left-->"+l);
        System.out.println("right-->"+r);
        if(l==nums.length)
            return l;
        else if(nums[l]<target)
            return l+1;
        else return l;

    }
    public static void main(String[] args) {
            int arr[]={1,3,5,6};
        System.out.println("The position is "+searchInsert(arr,2));
    }
}
