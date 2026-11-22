class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxSeq = 0;
        int CurrSeq = 0;
        HashMap<Integer,Integer> seqMap = new HashMap<>();
        for(int i = 0 ;i<nums.length; i++){
            if(!seqMap.containsKey(nums[i])){
            seqMap.put(nums[i], seqMap.getOrDefault(nums[i]-1, 0)+1);
            maxSeq = Math.max(maxSeq,seqMap.get(nums[i]));
            }
        }
        return maxSeq;
    }
}
