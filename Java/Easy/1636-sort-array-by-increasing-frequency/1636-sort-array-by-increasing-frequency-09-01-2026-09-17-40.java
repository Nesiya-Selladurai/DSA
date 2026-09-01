class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        Integer[] arr=new Integer[n];
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            if(!mp.get(a).equals(mp.get(b))){
                return mp.get(a) - mp.get(b);
            }
            return b-a;
        });
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}