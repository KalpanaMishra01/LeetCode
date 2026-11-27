class Solution {
    public boolean containsDuplicate(int[] nums) {
        // // boolean flag = false;
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = i+1 ; j < nums.length ; j++){
        //             if(nums[i] == nums[j]){
        //                 return true;
        //             }
        //     }
        // }
        // return false;



        // int i = 0;
        // for(int j = i+1 ; j < nums.length ; j++){
        //     if(nums[i] == nums[j]){
        //         return true;
        //     }
        //     i++;
        // }
        // return false;


        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;

    }
}