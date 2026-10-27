class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=cost.length;
        int tank=0,start=0;
        int s1=0,s2=0;
        for(int i=0;i<n;i++){
            s1+=gas[i];
            s2+=cost[i];
        }
        if(s1<s2){
            return -1;
        }
        for(int i=0;i<n;i++){
            tank+=gas[i]-cost[i];
            if(tank<0){
                tank=0;
                start=i+1;
            }
        }
        return start;
    }
}