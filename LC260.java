// TC: O(n)
// SC: O(1)

public class LC260 {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        int oneBitShifts = 0;
        while((xor&1)==0){
            xor = xor >> 1;
            oneBitShifts++;
        }
        int ans[] = new int[2];
        for(int i=0;i<n;i++){
            if(((nums[i]>>oneBitShifts)&1)==0) ans[0]^=nums[i];
            if(((nums[i]>>oneBitShifts)&1)==1) ans[1]^=nums[i];
        }
        return ans;
    }
}
