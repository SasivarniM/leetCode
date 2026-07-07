class Solution {
    public int majorityElement(int[] nums) {

        int a=0;
        int b=0;

        for(int n:nums){

            if(b==0){
                a=n;
            }

            if(n==a){
                b++;
            }
            else{
                b--;
            }
        }
        return a;
    }
}