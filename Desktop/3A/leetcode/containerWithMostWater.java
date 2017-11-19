import java.util.HashMap;

public class containerWithMostWater {
    public static int containersWithMostWater(int[] height) {
            if (height.length < 2) return 0;  
            int ans = 0;  
            int l = 0;  
            int r = height.length - 1;  
            while (l < r) {  
                int v = (r - l) * Math.min(height[l], height[r]);  
                if (v > ans) ans = v;  
                if (height[l] < height[r]) l++;  
                else r--;  
            }  
            return ans;  
        }  
    
    public static void main(String[] args) {
        int[] stringArray = {2,7,3,4,1,15};
        System.out.println(new containerWithMostWater().containersWithMostWater(stringArray));
    }
}
