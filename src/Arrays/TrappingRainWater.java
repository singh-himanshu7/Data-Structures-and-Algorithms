package Arrays;
//42
class TrappingRainWater {
    public static int trap(int[] height) {
        int leftmax = 0;
        int rightmax = 0;
        int total = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            if(height[i]<height[j]){
                if(leftmax>height[i]){
                    total += leftmax - height[i];
                }
                else{
                    leftmax = height[i];
                }
                i++;
            }
            else{
                if(rightmax > height[j]){
                    total += rightmax-height[j];
                }
                else{
                    rightmax = height[j];
                }
                j--;
            }
        }
        return total;
    }
}