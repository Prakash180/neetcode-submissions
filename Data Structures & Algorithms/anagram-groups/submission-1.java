class Solution {
    public String getFreq(String s){
        int[] count = new int[26];

        for(int i = 0 ;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
        }
        return Arrays.toString(count);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String a : strs){
            map.computeIfAbsent(getFreq(a), k -> new ArrayList<>()).add(a);
        }
        return new ArrayList<>(map.values());
    }
}
