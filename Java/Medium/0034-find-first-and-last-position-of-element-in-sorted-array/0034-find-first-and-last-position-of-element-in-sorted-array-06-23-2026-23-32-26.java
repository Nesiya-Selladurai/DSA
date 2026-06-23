class Solution {
    static int first(int[] arr,int n,int t){
        int l=0,h=n-1;
        int start=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==t){
                start=mid;
                h=mid-1;
            }
            else if(arr[mid]<t){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }return start;
    }
    static int last(int[] arr,int n,int t){
        int l=0,h=n-1;
        int end=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==t){
                end=mid;
                l=mid+1;
            }
            else if(arr[mid]>t){
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }return end;
    }
    public int[] searchRange(int[] nums, int t) {
        int n=nums.length;
        int f=first(nums,n,t);
        int l=last(nums,n,t);
        return new int[]{f,l};
    }
}