class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
        Map<String, List<String>> hm = new HashMap<>();
        
        for(int i=0;i<str.length;i++)
        {
            char arr[] = str[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if( !hm.containsKey(s))
            {
                List<String> list = new ArrayList<>();
                list.add(str[i]);
                hm.put(s, list);
            }else
            {
                hm.get(s).add(str[i]);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        
        for(Map.Entry<String, List<String>> itr: hm.entrySet())
        {
            List<String> res = itr.getValue();
            ans.add(res);
        }
        return ans;
    }
}