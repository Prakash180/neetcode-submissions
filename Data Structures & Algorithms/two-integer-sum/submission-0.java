class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numsMap.containsKey(target - nums[i])){
                res[0] = numsMap.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            numsMap.put(nums[i],i);
        }
        return res;
    }
}
