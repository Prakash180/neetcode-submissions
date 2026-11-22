class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String a : strs){
            char[] chArr = a.toCharArray();
            Arrays.sort(chArr);

            map.putIfAbsent(Arrays.toString(chArr), new ArrayList());
            map.get(Arrays.toString(chArr)).add(a);
        }
        return new ArrayList(map.values());
    }
}
