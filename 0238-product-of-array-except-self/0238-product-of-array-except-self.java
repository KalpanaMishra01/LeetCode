class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []answer = new int[nums.length];

        // for(int i = 0 ; i < nums.length ; i++){
        //     int prod = 1;
        //     for(int  j = 0 ; j < nums.length ; j++){
        //         if(i == j){
        //             continue;
        //         }else{
        //             prod = prod * nums[j];
        //         }
        //     }
        //     answer[i] = prod;
        // }
        // return answer;

        // int k = 0;
        // int prod = 1;
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(i == k){
        //         if(k == nums.length - 1){
        //             answer[k] = prod;
        //         }
        //         continue;
        //     }else if(i == nums.length - 1){
        //         prod = prod * nums[i];
        //         answer[k] = prod;
        //         i = -1;
        //         prod = 1;
        //         k++;
                
        //     }else{
        //         prod = prod * nums[i];
        //     }
        // }
        // return answer;

        int prodn0 = 1;
        int prod0 = 1;
        boolean flag = false;
        int zerocount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                prodn0 = prodn0 * nums[i];
            }else if(nums[i] == 0){
                prod0 = 0;
                flag = true;
                zerocount++;
            }  
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(zerocount >= 2){
                answer[i] = 0;
            }
            else if(flag){
                if(nums[i] != 0){
                    answer[i] = prod0;
                }
                if(nums[i] == 0){
                    answer[i] = prodn0;
                }
            }else{
                answer[i] = prodn0/nums[i];
            }
        }
        return answer;
    }
}