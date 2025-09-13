class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        String first=strs[0],last=strs[n-1];
        int min=Math.min(first.length(),last.length());
        for(int i=0;i<min;i++){
            if(first.charAt(i)!=last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}