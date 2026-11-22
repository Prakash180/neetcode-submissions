class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()+"#"+s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int hash = str.indexOf('#', i);
            int currLen = Integer.parseInt(str.substring(i,hash));
            i=hash+1;
            strs.add(str.substring(i,i+currLen));
            i += currLen;
        }
        return strs;
    }
}
