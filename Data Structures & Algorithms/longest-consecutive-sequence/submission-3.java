class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
        int maxSeq = 0;
        int currSeq;
        for(Integer n : numSet){
            if(numSet.contains(n-1))
                continue;
            currSeq = 1;
            while(numSet.contains(n+currSeq)){
                currSeq++;
            }
            maxSeq = Math.max(maxSeq, currSeq);
        }
        return maxSeq;
    }
}
