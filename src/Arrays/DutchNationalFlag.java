package Arrays;
//75
//import java.util.HashMap;
//import java.util.Map;

class DutchNationalFlag {
    public void sortColors(int[] nums) {
        int one = 0;
        int two = 0;
        int zero = 0;
        for(int i : nums){
            if(i==0) zero++;
            else if (i==1) one++;
            else two++;
        }
        int idx = 0;
        while (zero > 0){
            nums[idx]=0;
            idx++;
            zero--;
        }
        while (one > 0){
            nums[idx++]=1;
            one--;
        }
        while ((two--) > 0){
            nums[idx++]=2;
        }
    }
}