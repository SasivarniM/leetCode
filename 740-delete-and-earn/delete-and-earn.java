class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int max=0;

        for(int n:nums){
            max=Math.max(max,n);
        }
        int[] points=new int[max+1];

        for(int n:nums){
            points[n] +=n;
        }
        int take=0;
        int skip=0;

        for(int i=0;i<=max;i++){

            int takeNew=skip+points[i];
            int skipNew=Math.max(skip,take);

            take=takeNew;
            skip=skipNew;

        }

        return Math.max(take,skip);
    }
}