lass Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ans = strs[0];
        
        for(int i=1;i<strs.length;i++)
        {
            while(!strs[i].startsWith(ans))
            {
                ans = ans.substring(0, ans.length()-1);
                
                if( ans.isEmpty()) return "";
            }
        }
        return ans;
    }
}