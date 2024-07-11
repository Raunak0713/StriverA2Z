package Array.Medium;

public class Sort012 {
    public void sortColors(int[] nums) {
        int zc = 0;
        int oc = 0;
        int tc = 0;
        int n = nums.length;
        
        for(int a : nums){
            if(a == 0) zc++;
            else if(a == 1) oc++;
            else tc++;
        }

        for(int i=0; i<n; i++){
            if(zc > 0){
                nums[i] = 0;
                zc--;
            }else if(oc > 0){
                nums[i] = 1;
                oc--;
            }else if(tc > 0){
                nums[i] = 2;
                tc--;
            }
        }
    }
}
