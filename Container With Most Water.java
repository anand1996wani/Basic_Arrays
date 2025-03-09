/*
* Container With Most Water
*  
*/

class Solution {

    // O(N) 2 pointer solution
    public int maxArea(int[] height) {
        int low = 0, high=height.length - 1;
        int ans = 0;
        while(low < high){
            int water = 0;
            water = Math.min(height[low], height[high]) * (high - low);
            ans = Math.max(ans, water);

            if(height[low] <= height[high]){
                low++;
            }else{
                high--;
            }

        }
        return ans;
    }

    // N^2 solution
    public int maxArea1(int[] height) {
        int ans = 0;
        for(int i = 0;i < height.length;i++) {
            for(int j = i + 1;j < height.length;j++) {
                int water = 0;
                water = (Math.min(height[i], height[j]) * (j - i));
                ans = Math.max(ans, water);
            }
        }
        return ans;
    }
}
