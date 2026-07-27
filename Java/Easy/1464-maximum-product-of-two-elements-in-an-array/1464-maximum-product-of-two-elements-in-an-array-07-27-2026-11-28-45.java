class Solution {
    public int maxProduct(int[] nums) {
     int max=0,min=0;
     for(int i:nums){
        if(i>max){
            min=max;
            max=i;
        }
        else if(i>min && min!=i){
            min=i;
        }
     } 
     return (max-1) * (min-1);  
    }
}